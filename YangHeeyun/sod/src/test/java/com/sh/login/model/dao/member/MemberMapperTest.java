package com.sh.login.model.dao.member;

import com.sh.member.model.dao.MemberMapper;
import com.sh.member.model.dto.MemberDto;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class MemberMapperTest {

    @Autowired
    private MemberMapper memberMapper;

    @Test
    @DisplayName("회원가입")
    void insertMember() {
        // given
        String memberEmail = "test@sh.com";
        String memberPassword = "123456";
        String memberName= "a";
        String profilePath = "ㅋㅋㅋ";

        MemberDto memberDto = new MemberDto(0,memberEmail,memberPassword,memberName, null,profilePath);
        //when
        int result = memberMapper.insertMember(memberDto);
        System.out.println(memberDto);
        // then
        assertThat(result).isEqualTo(1); // 등록 성공하면 숫자 1반환하므로
        assertThat(memberDto.getMemberId()).isNotZero();
    }

    @Test
    @DisplayName("이메일 중복검사")
    void checkDuplicateEmail() {
        // given
        String memberEmail = "hong@example.com";
        // when
        int result = memberMapper.checkDuplicateEmail(memberEmail);
        System.out.println(result);
        // then
        assertThat(result).isEqualTo(1);
    }
}