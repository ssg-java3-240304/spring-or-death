package com.sh.choichanguk.member.controller;

import com.sh.choichanguk.member.model.dto.MemberRegistDto;
import com.sh.choichanguk.member.model.service.Service;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.filter.RequestContextFilter;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.time.LocalDateTime;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping("/member")
public class controller {

    private final Service service;
    private final RequestContextFilter requestContextFilter;

    @GetMapping("/regist")
    public String  regist(){
        return "member/regist";
    }


    @PostMapping(path = "/checkEmail", produces = "text/plain; charset=UTF-8")
    @ResponseBody // 이 핸들러의 반환객체를 직접 http 응답 메세지 본문(body)에 작성하라.
    public String first(@RequestParam String email) {
        log.debug("email = {}", email);

        String  memberEmail=service.findByEmail(email);

        System.out.println("여기는 이메일 체크입니다~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        if(memberEmail!=null)
            return "1"; // 중복된 이메일이 있다
        else return "0"; // 중복된 이메일이 없다 = 사용가능한 이메일이다
    }

    @PostMapping("/regist")
    public String regist(@ModelAttribute MemberRegistDto memberRegistInfo, RedirectAttributes redirectAttributes){
        System.out.println("멤버 등록까지 왔습니다");
        System.out.println("memberRegistInfo = " + memberRegistInfo);
        MemberRegistDto memberRegistDto = memberRegistInfo;
        int result=service.insertMember(memberRegistDto, LocalDateTime.now());

        System.out.println("결과 : "+result);
        return "redirect:/member/regist";
    }
}
