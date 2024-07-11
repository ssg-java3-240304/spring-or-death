package com.sh.choichanguk.board.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class BoardDto {

    private Long boardNo; // 글번호
    private int categoryCode; // 카테고리 번호
    private String categoryName; // 카테고리 이름
    private String boardTitle; // 글제목
    private String memberName;
    private Long boardCount; // 조회수
    private LocalDate createdDate; // 작성일
}
