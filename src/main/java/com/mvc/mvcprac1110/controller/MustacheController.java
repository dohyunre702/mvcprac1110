package com.mvc.mvcprac1110.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/new")
@Slf4j
public class MustacheController {
    @GetMapping("/hi")
    public String mustacheCon(Model model) {
        model.addAttribute("username", "user01");
        return "greetings"; //greetings라는 이름의 view 리턴

    }

    @GetMapping("/hi/{id}") //@PathVariable: URL경로에 템플릿변수를 넣어주는 것
    public String mustacheCon2(@PathVariable String id, Model model) {
        model.addAttribute("username", "user01");
        model.addAttribute("id", id);
        return "greetings";
    }
}
