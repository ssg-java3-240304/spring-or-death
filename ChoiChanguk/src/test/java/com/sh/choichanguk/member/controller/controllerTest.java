package com.sh.choichanguk.member.controller;

import com.sh.choichanguk.member.model.dto.BoardDto;
import com.sh.choichanguk.member.model.dto.MemberDto;
import com.sh.choichanguk.member.model.service.BoardService;
import com.sh.choichanguk.member.model.service.MemberService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

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

    @Test
    void boardlist()
    {
        List<MemberDto> boardDtos =boardService.boardAllList();
        System.out.println("boarderDtos = " + boardDtos);


    }

}