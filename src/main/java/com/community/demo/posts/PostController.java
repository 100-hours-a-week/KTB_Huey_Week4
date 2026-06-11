package com.community.demo.posts;

import com.community.demo.posts.dto.controller.*;
import com.community.demo.users.dto.service.DeleteUserServiceRequestDto;
import com.community.demo.users.dto.service.DeleteUserServiceResponseDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/posts")
public class PostController {

    @PostMapping
    public CreatePostControllerResponseDto create(CreatePostControllerRequestDto dto) {
        return new CreatePostControllerResponseDto();
    }

    @GetMapping
    public ListByPagePostControllerResponseDto listByPage(ListByPagePostControllerRequestDto dto) {
        return new ListByPagePostControllerResponseDto();
    }

    @GetMapping("/{post_id}")
    public ReadPostControllerResponseDto read(ReadPostControllerRequestDto dto) {
        return new ReadPostControllerResponseDto();
    }

    @PostMapping("/{post_id}")
    public UpdatePostControllerResponseDto update(UpdatePostControllerRequestDto dto) {
        return new UpdatePostControllerResponseDto();
    }

    @PatchMapping("/{post_id}")
    public LikePostControllerResponseDto like(LikePostControllerRequestDto dto) {
        return new LikePostControllerResponseDto();
    }

    @DeleteMapping("/{post_id}")
    public DeleteUserServiceResponseDto delete(DeleteUserServiceRequestDto dto) {
        return new DeleteUserServiceResponseDto();
    }
}
