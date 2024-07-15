package com.sh._01_loginform.login.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.cglib.core.Local;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;

@Data@AllArgsConstructor@NoArgsConstructor
public class MemberDto {

    private int memberId;
    private String memberEmail;
    private String memberPassword;
    private String memberName;
    private LocalDateTime registrationDate;
    private String path;
}