package com.sh._01_loginform.board.dao;

import com.sh._01_loginform.board.dto.BoardDto;
import com.sh._01_loginform.login.dto.MemberDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface BoardMapper {
    List<BoardDto> findAll();

    List<BoardDto> findAll2(int offset, int limit);

    int getCount();
}