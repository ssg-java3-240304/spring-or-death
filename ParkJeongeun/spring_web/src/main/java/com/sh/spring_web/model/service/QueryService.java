package com.sh.spring_web.model.service;

import com.sh.spring_web.model.dao.BoardMapper;
import com.sh.spring_web.model.dao.MemberMapper;
import com.sh.spring_web.model.dto.BoardMemberCategoryDto;
import com.sh.spring_web.model.dto.MemberDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class QueryService {
    private final MemberMapper memberMapper;
    private final BoardMapper boardMapper;
    public List<MemberDto> findAll() {
        return memberMapper.findAll();
    }

    public int findEmail(String memberEmail) {
        return memberMapper.findEmail(memberEmail);
    }

    public List<BoardMemberCategoryDto> findAll2(int offset, int limit) {
        return boardMapper.findAll2(offset, limit);
    }

    public int count() {
        return boardMapper.count();
    }
}