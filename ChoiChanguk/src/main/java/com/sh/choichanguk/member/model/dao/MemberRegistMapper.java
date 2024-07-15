package com.sh.choichanguk.member.model.dao;

import com.sh.choichanguk.member.model.dto.MemberRegistDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberRegistMapper {

    String findByEmail(String userEmail);

    int insertMember(MemberRegistDto memberRegistDto);
}
