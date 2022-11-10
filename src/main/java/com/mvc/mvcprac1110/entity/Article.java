package com.mvc.mvcprac1110.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

//entity = row
//db의 1개의 row(row, record)가 1개의 Class가 된다.
@Entity
@Table(name = "article2")
@NoArgsConstructor
@Getter
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //db에 id생성을 맡김
    private Long id;
    private String title;
    private String contents;

    public Article(String title, String contents) {
        this.title = title;
        this.contents = contents;
    }
}
