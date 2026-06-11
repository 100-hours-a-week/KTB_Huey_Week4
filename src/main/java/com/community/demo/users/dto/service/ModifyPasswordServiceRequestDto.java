package com.community.demo.users.dto.service;

import lombok.Data;

@Data
public class ModifyPasswordServiceRequestDto {
    public long userId;
    public String modifiedPassword;
}
