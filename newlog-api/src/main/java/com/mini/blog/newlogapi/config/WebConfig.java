package com.mini.blog.newlogapi.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry){
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:4001") // front단 포트번호
                .allowedMethods("GET", "POST")
                .allowedHeaders("*");

        WebMvcConfigurer.super.addCorsMappings(registry);
    }
    
}
