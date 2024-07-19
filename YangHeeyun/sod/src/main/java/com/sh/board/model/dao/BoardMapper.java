package com.sh.board.model.dao;

import com.sh.board.model.dto.BoardDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {

    List<BoardDto> findAll(int offset, int limit);

    int count();
}
