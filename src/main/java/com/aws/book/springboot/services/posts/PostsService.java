package com.aws.book.springboot.services.posts;

import lombok.RequiredArgsConstructor;

import com.aws.book.springboot.domain.posts.PostsRepository;
import com.aws.book.springboot.web.dto.PostsSaveRequestDto;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class PostsService {
    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto requestDto) {
        return postsRepository.save(requestDto.toEntity()).getId();
    }
}