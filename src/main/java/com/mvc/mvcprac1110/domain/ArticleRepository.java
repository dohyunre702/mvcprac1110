package com.mvc.mvcprac1110.domain;

import com.mvc.mvcprac1110.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

//Dao의 추상화된 버전
public interface ArticleRepository extends JpaRepository<Article, Long> {
}
