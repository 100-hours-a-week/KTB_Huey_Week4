package com.community.demo.users.dto.service;

import lombok.Data;

@Data
public class ModifyNicknameServiceRequestDto {
    public long userId;
    public String modifiedNickname;
}
