package com.sh.board.model.dto;

import com.sh.member.model.dto.MemberDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BoardDto {
    private int boardNo;
    private int boardType;
    private CategoryDto categoryDto; // categoryCode 가져올것
    private String boardTitle;
    private String boardBody;
    private MemberDto memberDto; // memberId 가져올것
    private int boardCount; // 조회수
    private LocalTime createdDate;
    private LocalTime modifiedDate;
    private String boardStatus;
}
