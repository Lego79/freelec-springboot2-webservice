package com.jojoldu.book.springboot.web.dto;

import com.jojoldu.book.springboot.domain.posts.Posts;
import lombok.Getter;


@Getter //setter는 무엇을 받는지 명시하지 않으면 모호해질 가능성이 있으므로 사용 자제
public class PostsResponseDto {

    private Long id;
    private String title;
    private String content;
    private String author;

    //생성자
    public PostsResponseDto(Posts entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
    }
}
