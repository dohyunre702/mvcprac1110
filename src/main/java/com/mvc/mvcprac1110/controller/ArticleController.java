package com.mvc.mvcprac1110.controller;

import com.mvc.mvcprac1110.domain.ArticleDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@Slf4j
public class ArticleController {

    //form 페이지
    @GetMapping(value = "/articles/new")
    public String newArticleForm(Model model) {
        model.addAttribute("username", "user01");
        return "articles/new";
    }

    @PostMapping(value="/posts")
    public String createArticle(ArticleDto form) {
        log.info(form.toString());
        return "";
    }


}
