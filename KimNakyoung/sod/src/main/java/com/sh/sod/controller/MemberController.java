package com.sh.sod.controller;

import com.sh.sod.model.dto.MemberDto;
import com.sh.sod.model.dto.MemberRegistDto;
import com.sh.sod.model.dto.ResponseDto;
import com.sh.sod.model.service.MemberCommandService;
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

    @GetMapping("/emailSameCheck")
    public @ResponseBody ResponseDto<?> check(@RequestParam("memberEmail") String memberEmail){
        if (memberEmail == null || memberEmail.isEmpty()) {
            return new ResponseDto<>(-1, "이메일을 입력해주세요", null);
        }

        boolean isDuplicate = memberCommandService.isEmailDuplicate(memberEmail);
        if (isDuplicate) {
            return new ResponseDto<>(1, "동일한 이메일이 존재합니다.", false);
        } else {
            return new ResponseDto<>(1, "해당 이메일로 회원가입 가능합니다.", true);
        }
    }

}
