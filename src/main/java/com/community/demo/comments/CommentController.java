package com.community.demo.comments;

import com.community.demo.comments.dto.controller.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/posts/{post_id}/comments")
public class CommentController {

    @PostMapping
    public CreateCommentControllerResponseDto create(CreateCommentControllerRequestDto dto) {
        return new CreateCommentControllerResponseDto();
    }

    @GetMapping
    public ReadAllCommentControllerResponseDto readAll(ReadAllCommentControllerRequestDto dto) {
        return new ReadAllCommentControllerResponseDto();
    }

    @PatchMapping("/{comment_id}")
    public UpdateCommentControllerResponseDto update(UpdateCommentControllerResponseDto dto) {
        return new UpdateCommentControllerResponseDto();
    }

    @DeleteMapping("/{comment_id}")
    public DeleteCommentControllerResponseDto delete(DeleteCommentControllerRequestDto dto) {
        return new DeleteCommentControllerResponseDto();
    }
}
