package com.sh.choichanguk.board.model.service;

import com.sh.choichanguk.board.model.dao.BoardListMapper;
import com.sh.choichanguk.board.model.dto.BoardDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {
    private final BoardListMapper boardListMapper;

    public BoardService(BoardListMapper boardListMapper) {
        this.boardListMapper = boardListMapper;
    }

    public List<BoardDto> boardAllList(int offset, int limit) {
        return boardListMapper.boardAllList(offset,limit);
    }

    public int count() {
        return boardListMapper.count();
    }
}
