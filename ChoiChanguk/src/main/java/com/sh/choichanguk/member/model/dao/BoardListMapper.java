package com.sh.choichanguk.member.model.dao;


import com.sh.choichanguk.member.model.dto.BoardDto;
import com.sh.choichanguk.member.model.dto.MemberDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardListMapper {
    List<MemberDto> boardAllList();
}
