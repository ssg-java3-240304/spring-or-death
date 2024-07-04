package com.sh.sod.controller;

import com.sh.sod.model.dto.MemberDto;
import com.sh.sod.model.dto.MemberRegistDto;
import com.sh.sod.model.service.MemberCommandService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@Slf4j
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {

    private final MemberCommandService memberCommandService;



    @GetMapping("/regist")
    public String regist(Model model){
        model.addAttribute("memberRegistDto", new MemberRegistDto());
        log.info("GET /member/regist");
        return "member/regist";
    }

    //회원가입등록
    @PostMapping("/regist")
    public String regist(@ModelAttribute MemberRegistDto memberRegistDto, RedirectAttributes redirectAttributes){
        log.info("POST /member/regist");
        log.debug("memberDto = {}", memberRegistDto);
        MemberDto memberDto = memberRegistDto.toMemberDto();
        int result = memberCommandService.insertMember(memberDto);
        redirectAttributes.addFlashAttribute("message", "회원을 성공적으로 등록했습니다.");
        return "redirect:/member/regist";

    }
}
