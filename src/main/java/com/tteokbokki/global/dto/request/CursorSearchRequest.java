package com.tteokbokki.global.dto.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.tteokbokki.global.dto.request.enums.DirProp;
import com.tteokbokki.global.dto.request.enums.OrderProp;
import io.swagger.v3.oas.annotations.Parameter;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springdoc.core.annotations.ParameterObject;

@Getter
@Setter
@ToString
@ParameterObject
public class CursorSearchRequest {

    @Parameter(description = "다음 커서 id(-1: 첫 페이지 요청)", example = "-1")
    private Long cursorId = -1L;

    @Parameter(description = "페이지 사이즈", example = "15")
    private Long size = 15L;

    @Parameter(description = "정렬 방향", example = "desc,asc")
    private DirProp dir = DirProp.desc;

    @JsonIgnore
    @Parameter(description = "정렬 유형", example = "desc,asc", hidden = true)
    private OrderProp prop = OrderProp.episode;

}
