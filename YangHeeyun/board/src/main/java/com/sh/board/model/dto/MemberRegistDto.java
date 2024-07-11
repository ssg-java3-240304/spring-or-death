package com.sh.board.model.dto;

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

    public MemberDto toMemberDto(){
        return new MemberDto(0, this.memberEmail, this.memberPassword, this.memberName,null);
    }
}
