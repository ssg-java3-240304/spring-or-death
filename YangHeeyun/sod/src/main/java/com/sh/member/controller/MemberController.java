package com.sh.member.controller;

import com.sh.member.model.dto.FileDto;
import com.sh.member.model.dto.MemberDto;
import com.sh.member.model.dto.MemberRegistDto;
import com.sh.member.model.service.FileUploadService;
import com.sh.member.model.service.MemberCommandService;
import com.sh.member.model.service.MemberQueryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;

@Controller
@Slf4j
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {
    private final MemberCommandService memberCommandService;
    private final MemberQueryService memberQueryService;
    private final FileUploadService fileUploadService;

    @GetMapping("/regist")
    public String showRegistForm(Model model){
        log.info("GET/member/regist");
        model.addAttribute("memberRegistDto", new MemberRegistDto());
        return "member/regist";
    }

    // 이메일 중복체크
    @GetMapping("/emailCheck")
    @ResponseBody // Integer 결과값을 넘겨주지 못해 필요함
    public int emailCheck(@RequestParam String email){
        log.info("클라이언트에서 이메일 받음 : {}",email);
        return memberQueryService.checkDuplicatEmail(email); // 중복이면 1, 중복이 아니면 0리턴
    }

    // 회원가입 post 요청
    @PostMapping("/regist")
    public String registMember(@ModelAttribute MemberRegistDto memberRegistDto,
                               RedirectAttributes redirectAttributes,
                               @RequestParam("photo") MultipartFile upFile) throws IOException {
        log.info("POST/member/regist");
        log.debug("memberDto = {}",memberRegistDto);

        // 파일 업로드 처리
        if (!upFile.isEmpty()) {
            FileDto fileDto = fileUploadService.upload(upFile);
            log.debug("fileDto = {}",fileDto);

            memberRegistDto.setProfilePath(fileDto.getProfilePath()); // 파일경로를 memberRegisDto에 넣어줌
        }

        // 입력한 회원가입정보를 DB에 저장
        MemberDto memberDto = memberRegistDto.toMemberDto();
        log.debug("memberDto: {}", memberDto);

        // 회원가입
        int result = memberCommandService.insertMember(memberDto);
        redirectAttributes.addFlashAttribute("message", "회원가입이 완료되었습니다");
        return "redirect:/member/regist";
    }
}
