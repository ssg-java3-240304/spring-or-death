package com.sh.choichanguk.member.controller;

import com.sh.choichanguk.member.model.dto.FileDto;
import com.sh.choichanguk.member.model.dto.MemberRegistDto;
import com.sh.choichanguk.member.model.service.Service;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.filter.RequestContextFilter;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping("/member")
public class controller {

    private final Service service;

    @GetMapping("/regist")
    public String regist() {
        return "member/regist";
    }


    // 이메일 중복확인
    @PostMapping(path = "/checkEmail", produces = "text/plain; charset=UTF-8")
    @ResponseBody // 이 핸들러의 반환객체를 직접 http 응답 메세지 본문(body)에 작성하라.
    public String first(@RequestParam String email) {
        log.debug("확인하려 하는 email = {}", email);

        String memberEmail = service.findByEmail(email);

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


        // 파일입출력 service단
        List<FileDto> list = new ArrayList<>();
        FileDto fileDto = null;

        if (!upFiles.isEmpty()) {
            fileDto = service.upload(upFiles);

        }

        System.out.println("fileDto = " + fileDto);

        if (fileDto != null) {
            System.out.println("멤버 등록까지 왔습니다");
            System.out.println("memberRegistInfo = " + memberRegistInfo);
            int result = service.insertMember(memberRegistInfo);
        }


        System.out.println("결과 : " + list);
        return "redirect:/member/regist";
    }
}
