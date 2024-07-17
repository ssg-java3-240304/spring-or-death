package com.sh.choichanguk.member.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberRegistDto {
    private String memberEmail;
    private String memberPassword;
    private String MemberName;

//    private String contentType;
//    private String originalFilename;    // 실제 업로드한 파일 이름
//    private String renamedFilename;     // unique 한 파일 이름을 만들기 위한 속성
    private String url; // 이미지가 등록된 url
}
