package com.sh._01_loginform.login.controller;

import com.sh._01_loginform.login.service.LoginService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Slf4j
@RequiredArgsConstructor
public class LoginController {
    private final LoginService loginService;

    @GetMapping("/regist")
    public String filter() {
        return "regist";
    }

    @GetMapping(path = "/duplicateCheck", produces = "text/plain; charset=UTF-8")
    @ResponseBody
    public String checkDuplicate(@RequestParam("email") String email) {
        Boolean bool = loginService.duplicateId(email);
        String status = String.valueOf(bool);
        return status;
    }

    @PostMapping("/registerMember")
    public String registerMember(@RequestParam String email,
                                 @RequestParam String password,
                                 @RequestParam String name
                                 ) {
        loginService.registerMember(email,password,name);
        return "redirect:/regist";
    }




}