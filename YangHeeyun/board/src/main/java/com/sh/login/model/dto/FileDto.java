package com.sh.login.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FileDto {
    private Long id;
    private String contentType;
    private String originalFilename; // 실제 업로드한 파일 이름
    private String renamedFilename;  // unique 한 파일 이름을 만들기 위한 속성
    private String profilePath; // FTP서버의 이미지 경로
}
