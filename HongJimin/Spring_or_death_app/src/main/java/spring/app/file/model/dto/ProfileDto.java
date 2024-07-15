package spring.app.file.model.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProfileDto {
    private long id;
    private String contentType;
    private String originalFilename; // 업로드한 파일명
    private String renamedFilename; // unique한 파일 이름을 만들기 위한 속성
}
