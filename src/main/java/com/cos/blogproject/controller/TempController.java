package com.cos.blogproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TempController {

    @GetMapping("/temps")
    // localhost://8000/blog/temp
    // 파일 기본 리턴경로 : src/main/resources/static 이니 home.html을 불러오려면 /home.html이라고 해야함
    public String home(){
        return "s";
    }
}
