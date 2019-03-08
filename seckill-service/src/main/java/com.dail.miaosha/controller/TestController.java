package com.dail.miaosha.controller;

import com.dail.miaosha.dto.CacheResult;
import com.dail.miaosha.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: dail
 * @CreateDate: 2019/3/6 16:39
 */
@RestController
public class TestController {

    @Autowired
    private RedisUtil redisUtil;

    @GetMapping("/get")
    public String get() {
        CacheResult<String> cacheResult = redisUtil.get("userid_1", String.class);
        return cacheResult.getData();
    }

    @GetMapping("/set")
    public void set() {
        redisUtil.set("userid_1", "1111");
    }
}
