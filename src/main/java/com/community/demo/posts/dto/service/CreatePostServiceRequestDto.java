package com.community.demo.posts.dto.service;

import lombok.Data;

@Data
public class CreatePostServiceRequestDto {
    public String title;
    public long userId;
    public String content;
    public String image;
}
