package com.sh.spring_web.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberRegistDto {
    private MultipartFile profile;
    private String memberEmail;
    private String memberPassword;
    private String memberName;
    public MemberDto toMemberDto(){
        return new MemberDto(null, null, this.memberEmail, this.memberPassword, this.memberName, null);
    }
}