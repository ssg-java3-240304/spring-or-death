package com.sh.board.model.service;

import com.sh.board.model.dao.MemberMapper;
import com.sh.board.model.dto.MemberDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberCommandService {
    private final MemberMapper memberMapper;

    public int insertMember(MemberDto memberDto) {
        return memberMapper.insertMember(memberDto);
    }
}
