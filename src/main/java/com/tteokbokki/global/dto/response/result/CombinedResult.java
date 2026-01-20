package com.tteokbokki.global.dto.response.result;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class CombinedResult<S, L> extends CommonResult {

    @Schema(description = "단일 데이터", nullable = false)
    private S data;

    @Schema(description = "페이징 데이터", nullable = false)
    private PageInfo page;

    @Schema(description = "리스트 데이터", nullable = false)
    private List<L> list;

}
