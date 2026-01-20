package com.tteokbokki.global.dto.request;

import com.tteokbokki.global.dto.request.enums.DirProp;
import com.tteokbokki.global.dto.request.enums.OrderProp;
import com.tteokbokki.global.exception.CustomException;
import com.tteokbokki.global.exception.ErrorCode;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

@Getter
@Setter
@ToString
@ParameterObject
public class SearchRequest {

    @Parameter(description = "페이징 여부", example = "true")
    private boolean paging = true;

    @Parameter(description = "페이지 번호", example = "1")
    private Long page = 1L;

    @Parameter(description = "페이지 사이즈", example = "15")
    private Long size = 15L;

    @Parameter(description = "정렬 조건", example = "idx, createAtOfNotice, createdAt, extraCreatedAt, seq")
    private List<OrderProp> props = List.of(OrderProp.idx);

    @Parameter(description = "정렬 방향", example = "desc,asc")
    private List<DirProp> dirs = List.of(DirProp.desc);

    @Parameter(hidden = true)
    private Sort sort;

    @Parameter(hidden = true)
    private Pageable pageable;

    @Schema(hidden = true)
    public void checkSortData() {
        if (props.size() != dirs.size()) {
            throw new CustomException(ErrorCode.INVALID_ORDER_PARAMETER);
        }
    }

    @Schema(hidden = true)
    public Long setOffset() {
        return (this.getPage() - 1) * this.getSize();
    }
}

