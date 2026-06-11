package com.community.demo.comments;

import com.community.demo.comments.dto.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CommentService {

    public GetCommentsListServiceResponseDto getCommentsList(GetCommentsListServiceRequestDto dto) {
        return new GetCommentsListServiceResponseDto();
    }

    public ModifyCommentServiceResponseDto modifyComment(ModifyCommentServiceRequestDto dto) {
        return new ModifyCommentServiceResponseDto();
    }

    public CreateCommentServiceResponseDto createComment(CreateCommentServiceRequestDto dto) {
        return new CreateCommentServiceResponseDto();
    }

    public DeleteCommentServiceResponseDto deleteComment(DeleteCommentServiceRequestDto dto) {
        return new DeleteCommentServiceResponseDto();
    }

}
