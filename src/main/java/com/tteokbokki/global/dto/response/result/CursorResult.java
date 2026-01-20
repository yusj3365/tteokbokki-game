package com.tteokbokki.global.dto.response.result;

import io.swagger.v3.oas.annotations.media.Schema;

import java.util.List;


public record CursorResult<T>(
    @Schema(description = "리스트 데이터")
    List<T> list,

    @Schema(description = "다음 커서 id")
    Long nextCursor,

    @Schema(description = """
        전체 페이지 개수
        ** 매번 데이터를 불러올 때마다 전체 페이지 개수는 변하지만 실제 가져오는 데이터에는 반영이 안될 수 있습니다.
        ** 따라서 전체 페이지 개수는 조회용으로만 사용해주시고, 추가 연산 작업은 지양해주시기 바랍니다.""")
    Long total
) {

}
