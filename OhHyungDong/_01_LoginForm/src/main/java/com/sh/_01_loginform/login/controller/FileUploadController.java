package com.sh._01_loginform.login.controller;

import com.sh._01_loginform.login.dto.FileDto;
import com.sh._01_loginform.login.service.FileUpLoadService;
import com.sh._01_loginform.login.service.LoginService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.xml.xpath.XPath;

@Controller
@Slf4j
@RequiredArgsConstructor
public class FileUploadController {

    private final FileUpLoadService fileUpLoadService;
    private final LoginService loginService;


    @PostMapping("/profileImage")
    public String imageUpload(@RequestParam MultipartFile imageFile, RedirectAttributes redirectAttributes) throws Exception {
        String path = null;
        try {
            FileDto fileDto = fileUpLoadService.upLoad(imageFile);
            path = fileDto.getPath();
            //RedirectAttributes를 통해서 리다이렉트 한 후 데이터를 저장
            redirectAttributes.addFlashAttribute("path", path);
            redirectAttributes.addFlashAttribute("message", "이미지가 정상적으로 저장되었습니다.");
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("error", "이미지의 저장을 실패했습니다.");
        }
        log.debug("여기까진 성공 ");
        log.debug("이미지 path : {}", path);
        return "redirect:/regist";

    }
}