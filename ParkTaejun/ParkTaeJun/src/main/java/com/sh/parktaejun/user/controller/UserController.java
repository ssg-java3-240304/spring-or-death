package com.sh.parktaejun.user.controller;

import com.sh.parktaejun.user.model.dto.UserDto;
import com.sh.parktaejun.user.model.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@Slf4j
@RequestMapping("/regist")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/regist")
    public void regist(){

    }

    @PostMapping("/regist")
    public String userInfoSave(@ModelAttribute UserDto userDto){
        int result = userService.registUserInfo(userDto);
        if(result == 1){
            System.out.println("회원이 성공적으로 등록되셨습니다.");
        }else {
            System.out.println("회원 등록 실패 ");
        }

        return "redirect:/regist/regist";
    }
//    @GetMapping(value = "/object", produces = "application/json; charset=utf-8")
//    @ResponseBody
//    public String object() {
//        return """
//                {
//                "name" :"홍길동",
//                "age" : 33,
//                "married" :false,
//                "pet": null
//                }
//                """;
//    }
}

