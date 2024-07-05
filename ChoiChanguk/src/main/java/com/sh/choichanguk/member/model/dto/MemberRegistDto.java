package com.sh.choichanguk.member.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberRegistDto {
    private String memberEmail;
    private String memberPassword;
    private String MemberName;
    private LocalDateTime registrationDate;
}
