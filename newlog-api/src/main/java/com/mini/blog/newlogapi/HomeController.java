package com.mini.blog.newlogapi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    /**
     * 루트 url 접근 시 index.html 화면으로 매핑
     */
    @GetMapping("/")
    public String index() {
        return "index.html";
    }
}
