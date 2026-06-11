package com.community.demo.auth.temp;

import lombok.AccessLevel;
import lombok.Getter;

@Getter(value = AccessLevel.PROTECTED)
public class Auth {
    private long userId;
    private String email;
    private String password;

    public Auth(long userId, String email, String password) {
        this.userId = userId;
        this.email = email;
        this.password = password;
        is_deleted = false;
    }

    public void modifyPassword(String modifiedPassword) {
        this.password = modifiedPassword;
    }

}
