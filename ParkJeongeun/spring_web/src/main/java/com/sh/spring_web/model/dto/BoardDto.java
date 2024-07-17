package com.sh.spring_web.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BoardDto {
    private int boardNo;
    private int boardType;
    private int categoryCode;
    private String boardTitle;
    private String boardBody;
    private int memberId;
    private int boardCount;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;
    private String boardStatus;
}