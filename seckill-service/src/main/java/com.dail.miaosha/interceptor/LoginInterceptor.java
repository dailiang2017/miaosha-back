package com.dail.miaosha.interceptor;

import com.alibaba.fastjson.JSON;
import com.dail.miaosha.config.UserLocal;
import com.dail.miaosha.constant.CookieConstant;
import com.dail.miaosha.constant.PrefixConstant;
import com.dail.miaosha.constant.RedisConstant;
import com.dail.miaosha.dto.BaseResult;
import com.dail.miaosha.dto.CacheResult;
import com.dail.miaosha.dto.UserDTO;
import com.dail.miaosha.enums.ErrorCodeEnum;
import com.dail.miaosha.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashSet;
import java.util.Set;

/**
 * @Description:
 * @Author: dail
 * @CreateDate: 2019/3/7 13:56
 */
@Service
public class LoginInterceptor extends HandlerInterceptorAdapter {

    private Set<String> filter = new HashSet<String>(){{add("/user/login");add("/error");}};

    @Autowired
    private RedisUtil redisUtil;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println(request.getServletPath() + "进入拦截器");

        if (filter.contains(request.getServletPath())) {
            System.out.println("跳过拦截器");
            return true;
        }
        String paramToken = request.getParameter(CookieConstant.COOKI_NAME_TOKEN);
        String cookieToken = getCookieValue(request, CookieConstant.COOKI_NAME_TOKEN);
        if (StringUtils.isEmpty(cookieToken) && StringUtils.isEmpty(paramToken)) {
            returnValue(response, ErrorCodeEnum.UNAUTHORIZED);
            return false;
        }
        String token = StringUtils.isEmpty(paramToken) ? cookieToken : paramToken;
        return checkTokenInfo(response, token);
    }

    /**
     * 查询限频标记是否存在  是：此时不能访问  否：此时可以访问
     * 限制一秒之内访问一次
     * @param userDTO
     * @return
     */
    private boolean frequencyControl(UserDTO userDTO) {
        CacheResult<String> result = redisUtil.get(PrefixConstant.FREQUENCY_KEY + userDTO.getId(), String.class);
        if (result.getData() == null) {
            redisUtil.set(PrefixConstant.FREQUENCY_KEY + userDTO.getId(), userDTO.getNickname(), 1);
            return true;
        }
        // 时间锁定中
        return false;
    }

    private boolean checkTokenInfo(HttpServletResponse response, String token) throws IOException {
        CacheResult<UserDTO> result = redisUtil.get(PrefixConstant.TOKEN_KEY + token, UserDTO.class);
        if (result.getData() == null) {
            //登录过期或者session不存在
            returnValue(response, ErrorCodeEnum.LOGIN_EXPIRE);
        } else {
            Long userid = result.getData().getId();
            CacheResult<String> uniqueToken = redisUtil.get(PrefixConstant.USERID_KEY + userid, String.class);
            if (!token.equals(uniqueToken.getData())) {
                // 其他人登录此账号，被踢出登录，删除token缓存信息
                redisUtil.delete(PrefixConstant.TOKEN_KEY + token);
                returnValue(response, ErrorCodeEnum.REPEAT_LOGIN);
            } else {
                if (!frequencyControl(result.getData())) {
                    returnValue(response, ErrorCodeEnum.REQUEST_FREQUENCY);
                } else {
                    // 存入ThreadLocal
                    UserLocal.setUser(result.getData());
                    // 重新设置session
                    redisUtil.set(PrefixConstant.TOKEN_KEY + token, result.getData(), RedisConstant.tokenToExpireDefault);
                    return true;
                }
            }
        }
        return false;
    }

    private void returnValue(HttpServletResponse response, ErrorCodeEnum codeEnum) throws IOException {
        response.setContentType("application/json;charset=UTF-8");
        OutputStream out = response.getOutputStream();
        String str = JSON.toJSONString(BaseResult.error(codeEnum));
        out.write(str.getBytes("UTF-8"));
        out.flush();
    }

    private String getCookieValue(HttpServletRequest request, String cookiName) {
        Cookie[] cookies = request.getCookies();
        if (cookies == null || cookies.length <= 0) {
            return null;
        }
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals(cookiName)) {
                return cookie.getValue();
            }
        }
        return null;
    }
}
