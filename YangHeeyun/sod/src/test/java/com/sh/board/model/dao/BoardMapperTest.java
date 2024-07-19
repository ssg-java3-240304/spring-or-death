package com.sh.board.model.dao;

import com.sh.board.model.dto.BoardDto;
import com.sh.board.model.service.BoardQueryService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BoardMapperTest {

    @Autowired
    private BoardMapper boardMapper;


    @Test
    @DisplayName("전체 페이지 조회")
    void findAll() {
        int page = 1;
        int limit = 10;
        int offset = (page - 1) * limit;

        List<BoardDto> boardDtos = boardMapper.findAll(offset,limit);
        System.out.println("boardDto입니다");
        for(BoardDto boardDto: boardDtos){
            System.out.println(boardDto);
        }
    }

    @Test
    @DisplayName("전체 페이지 수 계산")
    void count() {
        int result = boardMapper.count();
        System.out.println("전체 페이지 수 = " + result);
    }
}