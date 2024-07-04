package com.sh.spring_web.model.service;

import com.sh.spring_web.model.dao.MemberMapper;
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
    public List<MemberDto> findAll() {
        return memberMapper.findAll();
    }
}