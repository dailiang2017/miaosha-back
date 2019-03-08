package com.dail.miaosha.controller;

import com.dail.miaosha.config.UserLocal;
import com.dail.miaosha.dto.LoginDTO;
import com.dail.miaosha.dto.UserDTO;
import com.dail.miaosha.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

/**
 * @Description:
 * @Author: dail
 * @CreateDate: 2019/3/5 11:18
 */
@RestController
@RequestMapping("/user")
public class LoginController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public String login(@RequestBody LoginDTO loginDTO, HttpServletResponse response) {
        return userService.login(response, loginDTO);
    }

    @GetMapping("/getUser")
    public UserDTO getUser() {
        return UserLocal.getUser();
    }
}
