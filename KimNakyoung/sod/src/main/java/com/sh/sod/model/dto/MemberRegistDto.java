package com.sh.sod.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberRegistDto {
    private String memberEmail;
    private String memberPassword;
    private String memberName;

    public MemberDto toMemberDto() {
        return new MemberDto(null, this.memberEmail, this.memberPassword, this.memberName,null);
    }
}
