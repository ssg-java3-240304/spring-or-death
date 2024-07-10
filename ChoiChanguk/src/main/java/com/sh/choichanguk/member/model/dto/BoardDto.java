package com.sh.choichanguk.member.model.dto;

import java.time.LocalDate;

public class BoardDto {

    private Long boardNo; // 글번호
    private int categoryCode; // 카테고리 번호
    private String categoryName; // 카테고리 이름
    private String boardTitle; // 글제목
    private Long boardCount; // 조회수
    private LocalDate createdDate; // 작성일
}
