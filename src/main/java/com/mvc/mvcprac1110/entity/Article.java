package com.mvc.mvcprac1110.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//entity = row
//db의 1개의 row(row, record)가 1개의 Class가 된다.
@Entity
@NoArgsConstructor
@Getter
public class Article {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String contents;

    public Article(String title, String contents) {
        this.title = title;
        this.contents = contents;
    }
}
