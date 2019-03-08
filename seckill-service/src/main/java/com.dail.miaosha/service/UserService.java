package com.dail.miaosha.service;

import com.dail.miaosha.constant.CookieConstant;
import com.dail.miaosha.constant.PrefixConstant;
import com.dail.miaosha.constant.RedisConstant;
import com.dail.miaosha.dto.LoginDTO;
import com.dail.miaosha.dto.UserDTO;
import com.dail.miaosha.mapper.UserInfoDAO;
import com.dail.miaosha.model.UserInfo;
import com.dail.miaosha.model.UserInfoExample;
import com.dail.miaosha.util.RedisUtil;
import com.dail.miaosha.utils.BeanUtil;
import com.dail.miaosha.utils.CookieUtils;
import com.dail.miaosha.utils.ExceptionUtil;
import com.dail.miaosha.utils.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.UUID;

/**
 * @Description:
 * @Author: dail
 * @CreateDate: 2019/3/5 14:55
 */
@Service
public class UserService {

    @Autowired
    private UserInfoDAO userInfoDAO;
    @Autowired
    private RedisUtil redisUtil;

    @Transactional
    public String login(HttpServletResponse response, LoginDTO loginDTO) {
        String username = loginDTO.getUsername();
        String password = loginDTO.getPassword();
        ExceptionUtil.isTrue(StringUtil.isBlankOrEmpty(username) || StringUtil.isBlankOrEmpty(password)
                , "用户名或密码不能为空！");
        UserInfoExample example = new UserInfoExample();
        UserInfoExample.Criteria criteria = example.createCriteria();
        criteria.andNicknameEqualTo(username);
        List<UserInfo> list = userInfoDAO.selectByExample(example);
        ExceptionUtil.isTrue(list == null || list.size() == 0, "用户名或密码错误！");
        ExceptionUtil.isTrue(!list.get(0).getPassword().equals(password), "用户名或密码错误！");
        // 生成token
        String token = UUID.randomUUID().toString();
        addCookie(response, token, BeanUtil.copyProperties(list.get(0), UserDTO.class));
        return token;
    }

    /**
     * 增加cookie信息，并把token保存到redis
     * @param response
     * @param token
     * @param userDTO
     */
    private void addCookie(HttpServletResponse response, String token, UserDTO userDTO) {
        // 保存token到redis缓存中
        redisUtil.set(PrefixConstant.TOKEN_KEY + token, userDTO, RedisConstant.tokenToExpireDefault);
        // 缓存用户id和token的关系，用以确认同一用户同时只能有一个人可以登录
        redisUtil.set(PrefixConstant.USERID_KEY + userDTO.getId(), token);
        CookieUtils.setCookie(response, CookieConstant.COOKI_NAME_TOKEN, token, RedisConstant.tokenToExpireDefault);
    }
}
