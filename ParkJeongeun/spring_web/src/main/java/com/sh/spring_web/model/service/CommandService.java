package com.sh.spring_web.model.service;

import com.sh.spring_web.model.dao.MemberMapper;
import com.sh.spring_web.model.dto.MemberDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
@RequiredArgsConstructor
public class CommandService {
    private final MemberMapper memberMapper;
    public int insertMember(MemberDto memberDto) {
        return memberMapper.insertMember(memberDto);
    }
}