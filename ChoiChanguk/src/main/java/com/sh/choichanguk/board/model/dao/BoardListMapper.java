package com.sh.choichanguk.board.model.dao;


import com.sh.choichanguk.board.model.dto.BoardDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardListMapper {
    List<BoardDto> boardAllList(int offset,int limit);

    int count();

}
