package com.mini.blog.newlogapi.api;

import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class ApiTestController {

    @GetMapping()
    public String getMethodName() {
        return "hihihihi 성공햇수다";
    }
    

}
