package com.sh.member.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MemberRegistDto {
    private String memberEmail;
    private String memberPassword;
    private String memberName;
    private String profilePath; // 업로드한 이미지 FTP서버 파일 경로

    public MemberDto toMemberDto(){
        return new MemberDto(0, this.memberEmail, this.memberPassword, this.memberName,null, this.profilePath);
    }
}
