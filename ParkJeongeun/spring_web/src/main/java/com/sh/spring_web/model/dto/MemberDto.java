package com.sh.spring_web.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberDto {
    private String profile;
    private Long memberId;
    private String memberEmail;
    private String memberPassword;
    private String memberName;
    private LocalDateTime registrationDate;
}