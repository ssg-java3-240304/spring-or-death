package com.sh.board.model.service;

import com.sh.board.model.dao.BoardMapper;
import com.sh.board.model.dto.BoardDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardQueryService {
    // 생성자 의존주입 처리
    private final BoardMapper boardMapper;

    public List<BoardDto> findAll(int offset, int limit) {
        return boardMapper.findAll(offset,limit);
    }

    public int count() {
        return boardMapper.count();
    }

}
