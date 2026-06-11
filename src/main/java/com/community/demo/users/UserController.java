package com.community.demo.users;

import com.community.demo.users.dto.controller.ModifyNicknameUserControllerRequestDto;
import com.community.demo.users.dto.controller.ModifyNicknameUserControllerResponseDto;
import com.community.demo.users.dto.controller.ModifyPasswordUserControllerRequestDto;
import com.community.demo.users.dto.controller.ModifyPasswordUserControllerResponseDto;
import com.community.demo.users.dto.service.DeleteUserServiceRequestDto;
import com.community.demo.users.dto.service.DeleteUserServiceResponseDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users/{user_id}")
public class UserController {

    @PatchMapping("/nickname")
    public ModifyNicknameUserControllerResponseDto modify_nickname(ModifyNicknameUserControllerRequestDto dto) {
        return new ModifyNicknameUserControllerResponseDto();
    }

    @PatchMapping("/password")
    public ModifyPasswordUserControllerResponseDto modify_password(ModifyPasswordUserControllerRequestDto dto) {
        return new ModifyPasswordUserControllerResponseDto();
    }

    @DeleteMapping
    public DeleteUserServiceResponseDto signout(DeleteUserServiceRequestDto dto) {
        return new DeleteUserServiceResponseDto();
    }
}
