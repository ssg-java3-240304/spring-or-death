package com.sh.choichanguk.member.controller;

import com.sh.choichanguk.member.model.dto.BoardDto;
import com.sh.choichanguk.member.model.dto.MemberDto;
import com.sh.choichanguk.member.model.service.BoardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {

    private final BoardService boardService;

    public List<MemberDto> boardAllList(){
        return boardService.boardAllList();
    }
}
