package spring.app.member.model.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import spring.app.member.model.dao.MemberMapper;
import spring.app.member.model.dto.MemberEntity;
import spring.app.member.model.dto.MemberRegistDto;

@Service
@RequiredArgsConstructor
public class MemberCommandService {
    private final MemberMapper memberMapper;

    public int registMember(MemberRegistDto memberRegistDto) {
        return memberMapper.registMember(memberRegistDto);
    }

    public int checkSameMemberEmail(String memberEmail) {
        return memberMapper.checkSameMemberEmail(memberEmail);
    }
}
