package com.sh.spring_web.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BoardMemberCategoryDto {
    private Long boardNo;
    private String categoryName;
    private String boardTitle;
    private String memberName;
    private int boardCount;
    private LocalDateTime createdDate;
    private CategoryDto category;
    private MemberDto member;
}