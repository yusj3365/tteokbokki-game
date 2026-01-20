package com.tteokbokki.global.dto.response.result;

import com.tteokbokki.global.dto.request.SearchRequest;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PageInfo {

    @Schema(description = "전체 페이지", nullable = false, example = "10")
    private int total;

    @Schema(description = "페이지 단위", nullable = false, example = "15")
    private Long perPage;

    @Schema(description = "현재 페이지", nullable = false, example = "1")
    private Long currentPage;

    @Schema(description = "마지막 페이지", nullable = false, example = "10")
    private int lastPage;

    public PageInfo(SearchRequest req, Long total) {
        this.total = total == null ? 0 : total.intValue();
        this.perPage = req.getSize();
        this.currentPage = req.getPage();
        this.lastPage = total == null ? 0 : (int) Math.ceil((double) total / req.getSize());
    }

}
