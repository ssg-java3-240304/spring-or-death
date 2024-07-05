package com.sh.spring_web.model.dao;

import com.sh.spring_web.model.dto.MemberDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberMapper {
    int insertMember(MemberDto memberDto);

    List<MemberDto> findAll();

    List<String> findEmail();
}