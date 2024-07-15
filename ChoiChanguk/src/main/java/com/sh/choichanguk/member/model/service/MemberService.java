package com.sh.choichanguk.member.model.service;

import com.sh.choichanguk.member.model.dao.MemberRegistMapper;
import com.sh.choichanguk.member.model.dto.MemberRegistDto;

@org.springframework.stereotype.Service

public class MemberService {
    private final MemberRegistMapper memberRegistMapper;

    public MemberService(MemberRegistMapper memberRegistMapper) {
        this.memberRegistMapper = memberRegistMapper;
    }

    // 이메일로 체크
    public String findByEmail(String userEmail) {
        return memberRegistMapper.findByEmail(userEmail);
    }

    // 멤버 등록
    public int insertMember(MemberRegistDto memberRegistDto) {
        return memberRegistMapper.insertMember(memberRegistDto);
    }

}
