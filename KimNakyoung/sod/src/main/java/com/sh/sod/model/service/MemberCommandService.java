package com.sh.sod.model.service;



import com.sh.sod.model.dao.MemberMapper;
import com.sh.sod.model.dto.MemberDto;
import groovy.util.logging.Slf4j;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
@RequiredArgsConstructor
public class MemberCommandService {

    private final MemberMapper memberMapper;


    public int insertMember(MemberDto memberDto){
        return memberMapper.insertMember(memberDto);
    }

    public boolean isEmailDuplicate(String memberEmail) {
        int duplicate = memberMapper.existsByEmail(memberEmail);
        return duplicate == 1; // 1이면 true
    }
}
