package com.sh.sod.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MemberRegistDto {
    private String memberEmail;
    private String memberPassword;
    private String memberName;
    private String contentType;
    private String originalFilename;    // 실제 업로드한 파일 이름
    private String renamedFilename; // unique 한 파일 이름을 만들기 위한 속성
    private String fileUrl;


    public MemberDto toMemberDto() {
        return new MemberDto(null, this.memberEmail, this.memberPassword, this.memberName,null);
    }
}
