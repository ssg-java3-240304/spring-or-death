package com.sh.choichanguk.board.controller;

import com.sh.choichanguk.board.model.dto.BoardDto;
import com.sh.choichanguk.board.model.service.BoardService;
import com.sh.choichanguk.paging.PageCriteria;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {

    private final BoardService boardService;

    @GetMapping("/boardlist")
    public String boardList(Model model ,
                            @RequestParam(defaultValue = "1") int page,
                            @RequestParam(defaultValue = "10") int limit){
        // 1. 컨텐츠 영역 (limit쿼리)
        log.info("GET /board/board?page={}&limit={}", page, limit);
        int offset = (page - 1) * limit; // 1페이지 - 0, 2페이지 - 10, 3페이지 - 20, ...

        List<BoardDto> boardDtos=boardService.boardAllList(offset, limit);

        model.addAttribute("boardList",boardDtos);
        //게시글이 몇개 있는가??
        int count=boardService.count();
        String url = "boardlist"; // 간단히 상대경로 사용
        model.addAttribute("pageCriteria", new PageCriteria(page, limit, count, url));
        return "/board/boardlist";

    }
}
