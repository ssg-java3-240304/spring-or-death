package spring.app.member.model.dao;

import org.apache.ibatis.annotations.Mapper;
import spring.app.member.model.dto.MemberEntity;
import spring.app.member.model.dto.MemberRegistDto;

@Mapper
public interface MemberMapper {
    int registMember(MemberRegistDto memberRegistDto);

    int checkSameMemberEmail(String memberEmail);
}
