package spring.app.member.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import spring.app.member.model.dto.MemberDto;
import spring.app.member.model.dto.MemberRegistDto;
import spring.app.member.model.service.MemberCommandService;

@Controller
@Slf4j
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {
    private final MemberCommandService memberCommandService;

    @GetMapping("/regist")
    public void regist(Model model) {
        log.info("GET / member/regist");
        log.info("회원 등록 폼 띄우기");
    }

    @PostMapping("/regist")
//    @ResponseBody
    public String regist(@ModelAttribute MemberRegistDto memberRegistDto) {
        log.debug("/member/regist");
        log.debug("memberRegistDto = {}", memberRegistDto);

        MemberDto memberDto = memberRegistDto.toMemberDto();
        int result = memberCommandService.registMember(memberDto);
        return "redirect:/";
    }

    @PostMapping("/sameEmailCheck")
    @ResponseBody // ajax를 쓰기 위해 이 어노테이션 써야 함
    public int sameEmailCheck(@RequestParam String memberEmail) {
        log.debug("/member/sameEmailCheck");
        log.debug("memberEmail = {}", memberEmail);
        int result = memberCommandService.checkSameMemberEmail(memberEmail);
        return result;
    }
}
