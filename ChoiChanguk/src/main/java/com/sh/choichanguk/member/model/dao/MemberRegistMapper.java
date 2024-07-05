package com.sh.choichanguk.member.model.dao;

import com.sh.choichanguk.member.model.dto.MemberRegistDto;
import org.apache.ibatis.annotations.Mapper;

import java.time.LocalDateTime;

@Mapper
public interface MemberRegistMapper {

    String findByEmail(String userEmail);

    int insertMember(MemberRegistDto memberRegistDto, LocalDateTime now);
}
