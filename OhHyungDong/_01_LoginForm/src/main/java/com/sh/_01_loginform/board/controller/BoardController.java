package com.sh._01_loginform.board.controller;

import com.sh._01_loginform.board.dto.BoardDto;
import com.sh._01_loginform.board.service.BoardService;
import com.sh._01_loginform.common.PageCriteria;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    @GetMapping("/boardList")
    public String getList(
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(defaultValue = "10") int limit,
            Model model)
    {

        int offset = (page -1) * limit;
        List<BoardDto> boards = boardService.findAllLimit(offset,limit);
        model.addAttribute("boards", boards);

//      페이지 영역 링크 연결
        int count = boardService.getCount();
        String url = "boardList";
        model.addAttribute("pageCriteria", new PageCriteria(page, limit, count, url));
        return "boardList";
    }


}