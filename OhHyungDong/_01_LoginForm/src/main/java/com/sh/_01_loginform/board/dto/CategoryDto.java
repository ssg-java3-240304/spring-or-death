package com.sh._01_loginform.board.dto;

import com.sh._01_loginform.login.dto.MemberDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDto {
    private int categoryCode;
    private String categoryName;


}