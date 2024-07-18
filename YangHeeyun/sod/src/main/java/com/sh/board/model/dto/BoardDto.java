package com.sh.board.model.dto;

import com.sh.member.model.dto.MemberDto;

import java.time.LocalTime;

public class BoardDto {
    private int boardNo;
    private int boardType;
    private CategoryDto categoryCode;
    private String boardTitle;
    private String boardBody;
    private MemberDto memberId;
    private int boardCount; // 조회수
    private LocalTime createdDate;
    private LocalTime modifiedDate;
    private String boardStatus;
}
