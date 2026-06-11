package com.community.demo.comments;

import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository {

    public void save(Comment comment);

    public void findAll();


}
