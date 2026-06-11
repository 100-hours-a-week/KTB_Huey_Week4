package com.community.demo.posts;

import com.community.demo.posts.entity.Post;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository {
    public void save(Post post);

    public Post findById(long postId);
}
