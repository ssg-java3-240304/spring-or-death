package com.sh.spring_web.model.dao;

import com.sh.spring_web.model.dto.BoardMemberCategoryDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BoardMapper {
    List<BoardMemberCategoryDto> findAll2(@Param("offset") int offset, @Param("limit") int limit);

    int count();
}