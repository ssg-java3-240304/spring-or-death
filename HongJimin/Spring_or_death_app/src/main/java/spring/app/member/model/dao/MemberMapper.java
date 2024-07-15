package spring.app.member.model.dao;

import org.apache.ibatis.annotations.Mapper;
import spring.app.member.model.dto.MemberDto;

@Mapper
public interface MemberMapper {
    int registMember(MemberDto memberDto);

    int checkSameMemberEmail(String memberEmail);
}
