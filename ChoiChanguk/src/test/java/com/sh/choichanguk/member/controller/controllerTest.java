package com.sh.choichanguk.member.controller;

import com.sh.choichanguk.board.model.service.BoardService;
import com.sh.choichanguk.member.model.service.MemberService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class controllerTest {

    @Autowired
    private MemberService memberService;
    @Autowired
    private BoardService boardService;


//    @Test
//    void email()
//    {
//        int email=Integer.parseInt(service.findByEmail("hong@example.com"));
//        System.out.println("email = " + email);
//    }

//    @Test
//    void boardList()
//    {
//        List<BoardDto> boardDtos =boardService.boardAllList(offset, limit);
//
//        for (BoardDto boardDto:boardDtos)
//        {
//            System.out.println("boardDto = " + boardDto);
//        }
//
//
//    }
    @Test
    void count() {
        int count= boardService.count();
        System.out.println("count = " + count);
    }

}