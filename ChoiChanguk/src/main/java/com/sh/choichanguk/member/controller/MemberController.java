package com.sh.choichanguk.member.controller;

import com.sh.choichanguk.member.model.dto.MemberRegistDto;
import com.sh.choichanguk.member.model.service.FileUploadService;
import com.sh.choichanguk.member.model.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {

    private final MemberService memberService;
    private final FileUploadService fileUploadService;

    @GetMapping("/regist")
    public String regist() {
        return "member/regist";
    }


    // 이메일 중복확인
    @PostMapping(path = "/checkEmail", produces = "text/plain; charset=UTF-8")
    @ResponseBody // 이 핸들러의 반환객체를 직접 http 응답 메세지 본문(body)에 작성하라.
    public String first(@RequestParam String email) {
        log.debug("확인하려 하는 email = {}", email);

        String memberEmail = memberService.findByEmail(email);

        if (memberEmail != null)
            return "1"; // 중복된 이메일이 있다
        else return "0"; // 중복된 이메일이 없다 = 사용가능한 이메일이다
    }

    // @ModelAttribute 어노테이션을 쓰면 memberRegistInfo객체와, 제출되는 form에 name태그와 같은 parameter를 찾아 setter를 해준다
    @PostMapping("/regist")
    public String regist(
            @ModelAttribute MemberRegistDto memberRegistInfo,
            @RequestParam("upFile") MultipartFile upFiles
    ) throws IOException {
        System.out.println("멤버 등록까지 왔습니다");

        // 파일입출력 service단

        if (!upFiles.isEmpty()) {
            MemberRegistDto memberRegistDto=null;
            memberRegistDto=memberRegistInfo; //폼에서 제출한 이메일, 비밀번호, 이름 등록
            memberRegistDto.setUrl(fileUploadService.upload(upFiles)); // 파일을 등록한 url을 반환하여 등록함

            System.out.println("이미지 등록이 됐습니다");

            System.out.println("memberRegistDto = " + memberRegistDto);
            int result = memberService.insertMember(memberRegistDto);
        }

        return "redirect:/member/regist";
    }
}
