package com.sh.board.controller;

import com.sh.board.model.dto.*;
import com.sh.board.model.service.MemberCommandService;
import com.sh.board.model.service.MemberQueryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@Slf4j
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {
    private final MemberCommandService memberCommandService;
    private final MemberQueryService memberQueryService;

    @GetMapping("/regist")
    public String showRegistForm(Model model){
        log.info("GET/member/regist");
        model.addAttribute("memberRegistDto", new MemberRegistDto());
        return "member/regist";
    }

    // 이메일 중복체크
    @GetMapping("/emailCheck")
    public int emailCheck(@RequestParam String email){
        log.info("클라이언트에서 이메일 받음",email);
        return memberQueryService.checkDuplicatEmail(email); // 중복이면 1, 중복이 아니면 0리턴
    }

    // 회원가입 post요청
    @PostMapping("/regist")
    public String registMember(@ModelAttribute MemberRegistDto memberRegistDto, RedirectAttributes redirectAttributes) {
        log.info("POST/member/regist");

        // 입력한 회원가입정보를 DB에 저장한다.
        MemberDto memberDto = memberRegistDto.toMemberDto();
        log.info("Member Email: {}", memberDto.getMemberEmail());
        log.info("Member Password: {}", memberDto.getMemberPassword());
        log.info("Member Name: {}", memberDto.getMemberName());

        // 회원가입
        int result = memberCommandService.insertMember(memberDto);
        redirectAttributes.addFlashAttribute("message","회원가입이 완료되었습니다");

        return "redirect:/member/regist";
    }
}
