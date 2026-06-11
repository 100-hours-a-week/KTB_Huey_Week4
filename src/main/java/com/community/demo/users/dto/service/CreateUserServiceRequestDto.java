package com.community.demo.users.dto.service;

import lombok.Data;

@Data
public class CreateUserServiceRequestDto {
    String email;
    String password;
    String nickname;
    String profileImage;
}
