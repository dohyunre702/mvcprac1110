package com.mvc.mvcprac1110.controller;

import com.mvc.mvcprac1110.domain.ArticleDto;
import com.mvc.mvcprac1110.domain.ArticleRepository;
import com.mvc.mvcprac1110.entity.Article;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@Slf4j
public class ArticleController {

    //Spring이 ArticleRepository 구현체를 생성자로 주입
    private final ArticleRepository articleRepository;
    public ArticleController(ArticleRepository articleRepository) {

        this.articleRepository = articleRepository;
    }

    //form 페이지
    @GetMapping(value = "/articles/new")
    public String newArticleForm(Model model) {
        model.addAttribute("username", "user01");
        return "articles/new";
    }

    @GetMapping("/{id}") //Article로 받아 온 데이터를 출력하는 화면
    public String selectSingle(@PathVariable Long id, Model model) {
        //id를 받아 select해 Article로 받아 옴
        Optional<Article> optArticle = articleRepository.findById(id);

        if(!optArticle.isEmpty()) {
            model.addAttribute("article", optArticle.get());
            return "show";
        } else {
            return "error";
        }
    }

    @PostMapping(value="/posts")
    public String createArticle(ArticleDto form) {
        log.info(form.toString());
        Article article = form.toEntity();
        articleRepository.save(article);
        return "";
    }


}
