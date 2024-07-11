package com.sh.parktaejun.user.model.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.sql.Timestamp;

@Slf4j
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDto {
    private int memberId;
    private String memberName;
    private String memberPassword;
    private String memberEmail;
    private Timestamp registrationDate;
}
