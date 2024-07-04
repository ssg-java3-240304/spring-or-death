package com.sh.spring_web.controller;

import com.sh.spring_web.model.dto.MemberDto;
import com.sh.spring_web.model.dto.MemberRegistDto;
import com.sh.spring_web.model.service.CommandService;
import com.sh.spring_web.model.service.QueryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@Slf4j
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {
    private final QueryService queryService;
    private final CommandService commandService;

    @GetMapping("/regist")
    public void regist(Model model){
        log.info("GET /member/regist");
        List<MemberDto> members = queryService.findAll();
        log.debug("members = {}", members);
        model.addAttribute("members", members);
    }


    @PostMapping("/regist")
    public String regist(@ModelAttribute MemberRegistDto memberRegistDto, RedirectAttributes redirectAttributes){
        log.info("POST /member/regist");
        log.debug("memberRegistDto = {}", memberRegistDto);
        MemberDto memberDto = memberRegistDto.toMemberDto();
        int result = commandService.insertMember(memberDto);
//        redirectAttributes.addFlashAttribute("");
        return "redirect:/member/regist";
    }
}