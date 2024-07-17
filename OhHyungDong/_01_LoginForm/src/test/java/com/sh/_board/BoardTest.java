package com.sh._board;

import com.sh._01_loginform.Application;
import com.sh._01_loginform.board.dao.BoardMapper;
import com.sh._01_loginform.board.dto.BoardDto;
import com.sh._01_loginform.login.dao.LoginMapper;
import com.sh._01_loginform.login.dto.MemberDto;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

@SpringBootTest(classes = Application.class)
class BoardTest {
	private BoardMapper boardMapper;
	private LoginMapper loginMapper;

	@Autowired
	public BoardTest(BoardMapper boardMapper) {
		this.boardMapper = boardMapper;
	}



	@Test
	@DisplayName("모든 게시물 조회")
	void test1() {
		//given
		List<BoardDto> list = boardMapper.findAll();
		System.out.println(list);
		//when
		//then

	}

	@Test
	@DisplayName("게시물 Limit 걸어서")
	void test2() {
		//given
		int offset = 0; // 0개 생략 하고
		int limit = 10; // 10개 출력
		List<BoardDto> all2 = boardMapper.findAll2(offset, limit);
		//when
		System.out.println(all2.size());

		Assertions.assertThat(all2.size()).isEqualTo(10);

	}

	@Test
	@DisplayName("총 게시물 개수 세기 ")
	void test3() {
		//given
		int totalCount = boardMapper.getCount();

		Assertions.assertThat(totalCount).isEqualTo(123);

		System.out.println(totalCount);

		//when
		//then

	}

}
