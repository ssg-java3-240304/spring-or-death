package com.sh.sod.controller;

import com.sh.sod.model.dto.FileDto;
import com.sh.sod.model.dto.MemberDto;
import com.sh.sod.model.dto.MemberRegistDto;
import com.sh.sod.model.dto.ResponseDto;
import com.sh.sod.model.service.FileUploadService;
import com.sh.sod.model.service.MemberCommandService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Controller
@Slf4j
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {

    private final MemberCommandService memberCommandService;
    private final FileUploadService fileUploadService;



    @GetMapping("/regist")
    public String regist(Model model){
        model.addAttribute("memberRegistDto", new MemberRegistDto());
        log.info("GET /member/regist");
        return "member/regist";
    }

    //회원가입등록
    @PostMapping("/regist")
    public String regist(@ModelAttribute MemberRegistDto memberRegistDto){
        log.info("POST /member/regist");
        log.debug("memberDto = {}", memberRegistDto);
        MemberDto memberDto = memberRegistDto.toMemberDto();
//        int result = memberCommandService.insertMember(memberDto);
//        if (result == 1) {
//            redirectAttributes.addFlashAttribute("message", "회원을 성공적으로 등록했습니다.");
//        } // 이거 쓰려면 변수에 RedirectAttributes redirectAttributes 이거 쓰기 현재 뺐음
        memberCommandService.insertMember(memberDto); // 현재 이 결과를 쓸 곳이 없어서 변수에 안 담음
//        fileUploadService.upload(); // 회원가입 실패 했을 때 이미지 저장되면 안됨 이거 처리 해줘야함.
        // DB에 저장 성공하고 회원가입 성공하면 이미지 서버에 보냄으로 처리 하기 // 회원 가입 실패 
        return "redirect:/"; // 현재 다른 창이 없어서 index 창으로 간다고 해놈
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
