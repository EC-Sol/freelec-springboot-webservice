package com.aws.book.springboot.web;

import lombok.RequiredArgsConstructor;

import com.aws.book.springboot.services.posts.PostsService;
import com.aws.book.springboot.web.dto.PostsSaveRequestDto;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final PostsService postsService;

    @PostMapping(value="/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto) {
        return postsService.save(requestDto);
    }
    
    
}