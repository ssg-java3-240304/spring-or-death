package com.sh._01_loginform;

import com.sh._01_loginform.login.dao.LoginMapper;
import com.sh._01_loginform.login.dto.MemberDto;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.Optional;

@SpringBootTest
class ApplicationTests {
	private LoginMapper loginMapper;

	@Autowired
	public ApplicationTests(LoginMapper loginMapper) {
		this.loginMapper = loginMapper;
	}


	@Test
	@DisplayName("회원가입 ")
	void test3() {
		//given
		String memberEmail = "ohd7150@nate.com";
		String memberPassword = "tjffl123";
		String memberName = "dhgudehd";
		String path = " / ";

		//when
		int result = loginMapper.registerMember(memberEmail, memberPassword, memberName,path);
		//then
		Assertions.assertThat(result).isEqualTo(1);
	}
	@DisplayName("아이디 있는지 확인 ")
	@Test
	void test2() {
		//given
		String id = "ohd7150@nate.com";
		Optional<MemberDto> optionalLoginDto = loginMapper.duplicateId(id);
		System.out.println(optionalLoginDto);
		Boolean bool = optionalLoginDto.isPresent();
		String str = String.valueOf(bool);
		System.out.println(str);
		//when
		//then
		Assertions.assertThat(optionalLoginDto.isPresent()).isTrue();

	}

}
