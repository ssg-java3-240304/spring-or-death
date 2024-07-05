package com.sh.choichanguk.member.model.service;
import com.sh.choichanguk.member.model.dao.MemberRegistMapper;
import com.sh.choichanguk.member.model.dto.MemberRegistDto;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@org.springframework.stereotype.Service
@RequiredArgsConstructor
public class Service {
    private final MemberRegistMapper memberRegistMapper;

    public String findByEmail(String userEmail) {
        return memberRegistMapper.findByEmail(userEmail);
    }

    public int insertMember(MemberRegistDto memberRegistDto, LocalDateTime now) {
        return memberRegistMapper.insertMember(memberRegistDto,now);
    }
}
