package com.sh.spring_web.controller;

import com.sh.spring_web.common.paging.PageCriteria;
import com.sh.spring_web.model.dto.BoardMemberCategoryDto;
import com.sh.spring_web.model.service.QueryService;
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
    private final QueryService queryService;

    @GetMapping("/boardList")
    public void board(
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(defaultValue = "10") int limit,
            Model model
    ){
        log.info("GET /board/list?page={}&limit={}", page, limit);
        int offset = (page - 1) * limit;
        List<BoardMemberCategoryDto> boards = queryService.findAll2(offset, limit);
        log.debug("boards = {}", boards);
        model.addAttribute("boards", boards);

        int totalCount = queryService.count();
        String url = "boardList";
        model.addAttribute("pageCriteria", new PageCriteria(page, limit, totalCount, url));
    }
}