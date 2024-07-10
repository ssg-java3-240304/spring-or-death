package com.sh.choichanguk.member.model.service;

import com.sh.choichanguk.member.model.dao.BoardListMapper;
import com.sh.choichanguk.member.model.dto.BoardDto;
import com.sh.choichanguk.member.model.dto.MemberDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {
    private final BoardListMapper boardListMapper;

    public BoardService(BoardListMapper boardListMapper) {
        this.boardListMapper = boardListMapper;
    }

    public List<MemberDto> boardAllList() {
        return boardListMapper.boardAllList();
    }
}
