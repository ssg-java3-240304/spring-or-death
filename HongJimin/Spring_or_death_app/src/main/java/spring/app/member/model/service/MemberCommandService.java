package spring.app.member.model.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import spring.app.member.model.dao.MemberMapper;
import spring.app.member.model.dto.MemberDto;

@Service
@RequiredArgsConstructor
public class MemberCommandService {
    private final MemberMapper memberMapper;

    public int registMember(MemberDto memberDto) {
        return memberMapper.registMember(memberDto);
    }

    public int checkSameMemberEmail(String memberEmail) {
        return memberMapper.checkSameMemberEmail(memberEmail);
    }
}
