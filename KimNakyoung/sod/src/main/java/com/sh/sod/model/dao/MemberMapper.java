package com.sh.sod.model.dao;

import com.sh.sod.model.dto.MemberDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {

    int insertMember(MemberDto memberDto);
}
