package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String homePage() {
        return "index";  // Это будет искать index.html в папке templates
    }

    // Новый метод для страницы с информацией об авторе
    @GetMapping("/author")
    public String authorPage() {
        return "author";  // Это будет искать author.html в папке templates
    }
}
