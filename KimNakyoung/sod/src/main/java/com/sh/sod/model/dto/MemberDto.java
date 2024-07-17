package com.sh.sod.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberDto {
    private Integer memberId;
    private String memberEmail;
    private String memberPassword;
    private String memberName;
    private Timestamp registrationDate;
    private String fileUrl;
}
