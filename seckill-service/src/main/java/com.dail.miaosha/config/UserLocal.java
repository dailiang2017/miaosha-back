package com.dail.miaosha.config;

import com.dail.miaosha.dto.UserDTO;

public class UserLocal {

    private static ThreadLocal<UserDTO> userHolder = new ThreadLocal<UserDTO>();

    public static void setUser(UserDTO user) {
        userHolder.set(user);
    }

    public static UserDTO getUser() {
        return userHolder.get();
    }

}
