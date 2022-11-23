package com.jojoldu.book.springboot.web.dto;


import com.jojoldu.book.springboot.domain.posts.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsSaveRequestDto {




    private String title;
    private String author;
    private String content;

    @Builder
    public PostsSaveRequestDto(String title, String author, String content) {
        this.title = title;
        this.author = author;
        this.content = content;
    }

    public Posts toEntity() {
        return Posts.builder()
                .author(author)
                .title(title)
                .title(title)
                .build();
    }




}
