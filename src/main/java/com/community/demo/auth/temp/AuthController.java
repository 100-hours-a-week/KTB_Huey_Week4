package com.community.demo.auth.temp;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class AuthController {

    @PostMapping("/signup")
    public void signup() {

    }

    @PostMapping("/login")
    public void login() {

    }

}
