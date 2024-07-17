package com.sh._01_loginform.board.service;

import com.sh._01_loginform.board.dao.BoardMapper;
import com.sh._01_loginform.board.dto.BoardDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardMapper boardMapper;
    public List<BoardDto> findAll() {
        return  boardMapper.findAll();
    }

    public List<BoardDto> findAllLimit(int offset, int limit) {
        return boardMapper.findAll2(offset, limit);
    }

    public int getCount(){
        return  boardMapper.getCount();
    }
}