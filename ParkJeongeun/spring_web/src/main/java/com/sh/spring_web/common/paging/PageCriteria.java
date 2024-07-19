package com.sh.spring_web.common.paging;

import lombok.Data;

@Data
public class PageCriteria {
    private final int page;
    private final int limit;
    private final int totalCount;
    private final String url;

    private int maxPage;
    private int pagebarSize;
    private int pagebarStart;
    private int pagebarEnd;

    public PageCriteria(int page, int limit, int totalCount, String url) {
        this.page = page;
        this.limit = limit;
        this.totalCount = totalCount;
        this.url = url + (url.contains("?") ? "&page=" : "?page=");
        this.maxPage = (int)Math.ceil((double) totalCount / limit);
        this.pagebarSize = 10;
        this.pagebarStart = (page - 1)/pagebarSize * pagebarSize + 1;
        this.pagebarEnd = pagebarStart + pagebarSize + 1;
    }
}