package com.community.demo.posts;

import com.community.demo.posts.dto.service.*;
import com.community.demo.posts.entity.Post;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;

    public CreatePostServiceResponseDto createPost(CreatePostServiceRequestDto dto) {
        Post post = new Post(dto.getTitle(), dto.getUserId(), dto.getContent(), dto.getImage());
        postRepository.save(post);
        return new CreatePostServiceResponseDto();
    }

    public DeletePostServiceResponseDto deletePost(DeletePostServiceRequestDto dto) {
        Post post = postRepository.findById(dto.getPostId());

        return new DeletePostServiceResponseDto();
    }

    public ViewPostServiceResponseDto viewPost(ViewPostServiceRequestDto dto) {
        Post post = postRepository.findById(dto.getPostId());

        return new ViewPostServiceResponseDto();
    }

    public GetListByPageServiceResponseDto getPostListByPage(GetListByPageServiceRequestDto dto) {
        return new GetListByPageServiceResponseDto();
    }

    public ModifyPostServiceResponseDto modifyPost(ModifyPostServiceRequestDto dto) {
        Post post = postRepository.findById(dto.getPostId());
        post.modify(dto.getModifiedTitle(), dto.getModifiedContent(), dto.getModifiedImage());
        postRepository.save(post);
        return new ModifyPostServiceResponseDto();
    }

    public LikePostServiceResponseDto likePost(LikePostServiceRequestDto dto) {
        return new LikePostServiceResponseDto();
    }

    public ReportPostServiceResponseDto reportPost(ReportPostServiceRequestDto dto) {
        return new ReportPostServiceResponseDto();
    }
}
