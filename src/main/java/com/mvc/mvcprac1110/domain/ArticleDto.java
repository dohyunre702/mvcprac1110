package com.mvc.mvcprac1110.domain;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString //override
public class ArticleDto {
    private long id;
    private String title;
    private String content;

    //생성자
    public ArticleDto(long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }
}
