package com.sh.board.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MemberDto {
    private int memberId; // 회원ID(auto)
    private String memberEmail; // 이메일
    private String memberPassword; // 비밀번호
    private String memberName; // 이름
    private String registrationDate; // 가입일자
}
