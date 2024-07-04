package com.sh.choichanguk.login.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class controller {

    @GetMapping("/regist")
    public String  regist(){
        return "regist/regist";
    }
}
