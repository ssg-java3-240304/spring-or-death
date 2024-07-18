package com.sh.login.model.service;

import com.sh.login.model.dao.MemberMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberQueryService {
    private final MemberMapper memberMapper;

    // 이메일 중복확인
    public int checkDuplicatEmail(String memberEmail){
        int emailCheck = memberMapper.checkDuplicateEmail(memberEmail);
        return emailCheck;
    }

}
