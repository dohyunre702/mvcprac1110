package controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/articles")
@Slf4j
public class ArticleController {

    @GetMapping("/hi")
    public String mustacheCon(Model model) {
        model.addAttribute("username", "user01");
        return "greetings"; //greetings라는 이름의 view 리턴

    }

    @GetMapping("/new")
    public String createPage() {
        return "articles/new";
    }
}
