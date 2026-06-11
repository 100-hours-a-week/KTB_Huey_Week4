package com.community.demo.users;

import com.community.demo.auth.temp.Auth;
import com.community.demo.auth.temp.AuthRepository;
import com.community.demo.users.dto.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final AuthRepository authRepository;

    public CreateUserServiceResponseDto createUser(CreateUserServiceRequestDto dto) {
        User user = new User(dto.getNickname(), dto.getProfileImage());
        userRepository.save(user);
        return new CreateUserServiceResponseDto();
    }

    public DeleteUserServiceResponseDto deleteUser(DeleteUserServiceRequestDto dto) {
        User user = userRepository.findById(dto.getUserId());
        user.signout();
        userRepository.save(user);
        return new DeleteUserServiceResponseDto();
    }

    public ModifyNicknameServiceResponseDto modifyNickname(ModifyNicknameServiceRequestDto dto) {
        User user = userRepository.findById(dto.getUserId());
        user.modifyNickname(dto.getModifiedNickname());
        userRepository.save(user);
        return new ModifyNicknameServiceResponseDto();
    }

    public ModifyPasswordServiceResponseDto modifyPassword(ModifyPasswordServiceRequestDto dto) {
        Auth auth = authRepository.findById(dto.getUserId());
        auth.modifyPassword(dto.getModifiedPassword());
        authRepository.save(auth);
        return new ModifyPasswordServiceResponseDto();
    }

}
