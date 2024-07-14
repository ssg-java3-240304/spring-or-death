package spring.app.file.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import spring.app.file.model.dto.ProfileDto;
import spring.app.file.model.service.ProfileUploadService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
@Slf4j
@RequiredArgsConstructor
public class ProfileUploadController {
    private final ProfileUploadService profileUploadService;

    @PostMapping("/uploadProfile")
    public String profileUpload(@RequestParam("profile") List<MultipartFile> upProfiles) throws IOException {
        // 파일 업로드 처리
        List<ProfileDto> list = new ArrayList<>();
        for (MultipartFile file : upProfiles) {
            if (!file.isEmpty()) {
                ProfileDto profileDto = profileUploadService.profileUpload(file);
                list.add(profileDto);

            }
        }
        log.debug("list = {}", list);

        // 업로드한 파일명 경로를 DB에 등록
        profileUploadService.profileUrlUpload(file);

        return "redirect:/";
    }
}
