package com.sh.board.controller;

import com.sh.board.model.dto.BoardDto;
import com.sh.board.model.service.BoardQueryService;
import com.sh.common.PageCriteria;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@Slf4j
@RequestMapping("/board")
@RequiredArgsConstructor
public class BoardController {

    private final BoardQueryService boardQueryService;

    @GetMapping("/boardList")
    public String boardList(
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(defaultValue = "10") int limit,
            Model model) {
        log.info("GET /menu/list?page={}&limit={}", page, limit);

        // 1. 컨텐츠 영역 (limit쿼리)
        int offset = (page - 1) * limit; // 1페이지 - 0, 2페이지 - 10, 3페이지 - 20, ...
        List<BoardDto> boards = boardQueryService.findAll(offset, limit);
        log.debug("boards = {}", boards);
        model.addAttribute("boards", boards);

        // 2. 페이지바 영역 (html)
        int totalCount = boardQueryService.count(); // 전체 게시물 수
        String url = "boardList"; // 간단히 상대경로 사용
        model.addAttribute("pageCriteria", new PageCriteria(page, limit, totalCount, url));

        return "board/boardList";
    }
}
