package com.community.demo.posts.dto.service;

import lombok.Data;

@Data
public class ModifyPostServiceRequestDto {

    public long postId;
    public String modifiedTitle;
    public String modifiedContent;
    public String modifiedImage;
}
