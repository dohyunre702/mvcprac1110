package com.mvc.mvcprac1110.domain;

import com.mvc.mvcprac1110.entity.Article;
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

    public Article toEntity() {
        return new Article(title, content);
    }
}
