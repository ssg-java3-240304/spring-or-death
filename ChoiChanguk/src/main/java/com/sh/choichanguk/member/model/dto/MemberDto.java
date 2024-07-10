package com.sh.choichanguk.member.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberDto {
    private Long memberId;
    private String memberName;

    List<BoardDto> boardDtos;
}
