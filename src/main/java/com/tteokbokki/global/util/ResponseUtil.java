package com.tteokbokki.global.util;

import com.tteokbokki.global.dto.response.result.CombinedResult;
import com.tteokbokki.global.dto.response.result.CursorResult;
import com.tteokbokki.global.dto.response.result.ListResult;
import com.tteokbokki.global.dto.response.result.PageInfo;
import com.tteokbokki.global.dto.response.result.SingleResult;
import lombok.experimental.UtilityClass;

import java.util.List;

@UtilityClass
public class ResponseUtil {

    public static <T> SingleResult<T> getSingleResult(T data) {
        return SingleResult.of(data);
    }

    public static <T> ListResult<T> getListResult(List<T> list, PageInfo page) {
        ListResult<T> result = new ListResult<>();
        result.setList(list);
        result.setPage(page);
        return result;
    }

    public static <T> ListResult<T> getListResult(List<T> list) {
        ListResult<T> result = new ListResult<>();
        result.setList(list);
        return result;
    }

    public static <T> CursorResult<T> getCursorResult(List<T> list, Long nextCursor, Long total) {
        return new CursorResult<>(list,nextCursor,total);
    }

    public static <S, L> CombinedResult<S, L> getCombinedResult(S data, List<L> list, PageInfo pageInfo) {
        CombinedResult<S, L> result = new CombinedResult<>();
        result.setData(data);
        result.setPage(pageInfo);
        result.setList(list);
        return result;
    }
}
