package com.sh.member.model.dao;

import com.sh.member.model.dto.MemberDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {
    // 회원가입
    int insertMember(MemberDto memberDto);

    // 이메일 중복체크
    int checkDuplicateEmail(String memberEmail);
}
