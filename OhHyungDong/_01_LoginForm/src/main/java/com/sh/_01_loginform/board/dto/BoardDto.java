package com.sh._01_loginform.board.dto;

import com.sh._01_loginform.login.dto.MemberDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BoardDto {
    private int boardNo;
    private int boardType;
    private CategoryDto categoryDto;
    private String boardTitle;
    private String boardBody;
    private MemberDto memberDto;
    private int boardCount;
    private LocalDate createdAt;
    private LocalDate modifiedDate;
    private String boardStatus;

}