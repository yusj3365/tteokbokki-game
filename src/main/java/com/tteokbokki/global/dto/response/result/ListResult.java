package com.tteokbokki.global.dto.response.result;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class ListResult<T> extends CommonResult {

    @Schema(description = "페이징 데이터", nullable = false)
    private PageInfo page;

    @Schema(description = "리스트 데이터", nullable = false)
    private List<T> list;

}
