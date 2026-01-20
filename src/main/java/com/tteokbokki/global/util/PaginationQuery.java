package com.tteokbokki.global.util;

import com.cmb.rainbowtv.global.dto.request.CursorSearchRequest;
import com.cmb.rainbowtv.global.dto.request.SearchRequest;
import com.cmb.rainbowtv.global.dto.response.result.CombinedResult;
import com.cmb.rainbowtv.global.dto.response.result.CursorResult;
import com.cmb.rainbowtv.global.dto.response.result.ListResult;
import com.cmb.rainbowtv.global.dto.response.result.PageInfo;

import java.util.List;
import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public interface PaginationQuery {

    /**
     * @param searchQuery SELECT 문 함수
     * @param countQuery  COUNT 문 함수
     * @param request     요청 DTO
     * @param <T>         오프셋 페이지네이션 결과 DTO
     * @param <R>         SearchRequest 자식 클래스
     * @return 오프셋 페이지네이션 결과
     */
    default <T, R extends SearchRequest> ListResult<T> createOffsetPagination(
        Supplier<List<T>> searchQuery,
        Supplier<Long> countQuery,
        R request
    ) {
        // SELECT 쿼리 결과 목록
        List<T> data = searchQuery.get();

        // COUNT 쿼리 결과 DTO 생성
        PageInfo pageInfo = null;
        if (request.isPaging()) {
            Long count = countQuery.get();
            pageInfo = new PageInfo(request, count);
        }

        // 페이징 결과 DTO 생성
        ListResult<T> result = new ListResult<>();
        result.setList(data);
        result.setPage(pageInfo);

        return result;
    }

    /**
     * @param searchQuery SELECT 문 함수
     * @param countQuery  COUNT 문 함수
     * @param request     요청 DTO
     * @param <T>         오프셋 페이지네이션 결과 DTO
     * @param <R>         SearchRequest 자식 클래스
     * @return 오프셋 페이지네이션 결과
     */
    default <T, R extends SearchRequest> ListResult<T> createOffsetPagination(
        Function<R, List<T>> searchQuery,
        Function<R, Long> countQuery,
        R request
    ) {
        // SELECT 쿼리 결과 목록
        List<T> data = searchQuery.apply(request);

        // COUNT 쿼리 결과 DTO 생성
        PageInfo pageInfo = null;
        if (request.isPaging()) {
            Long count = countQuery.apply(request);
            pageInfo = new PageInfo(request, count);
        }

        // 페이징 결과 DTO 생성
        ListResult<T> result = new ListResult<>();
        result.setList(data);
        result.setPage(pageInfo);

        return result;
    }


    default <T, R extends SearchRequest, S> ListResult<T> createOffsetPagination(
        BiFunction<R, S[], List<T>> searchQuery,
        BiFunction<R, S[], Long> countQuery,
        R offsetRequest,
        S... additionalRequests
    ) {
        // SELECT 쿼리 결과 목록
        List<T> data = searchQuery.apply(offsetRequest, additionalRequests);

        // COUNT 쿼리 결과
        Long total = countQuery.apply(offsetRequest, additionalRequests);
        // COUNT 쿼리 결과 DTO 생성
        PageInfo pageInfo = null;
        if (offsetRequest.isPaging()) {
            Long count = countQuery.apply(offsetRequest, additionalRequests);
            pageInfo = new PageInfo(offsetRequest, count);
        }

        // 페이징 결과 DTO 생성
        ListResult<T> result = new ListResult<>();
        result.setList(data);
        result.setPage(pageInfo);

        return result;
    }


    /**
     * @param searchQuery     SELECT 문 함수
     * @param countQuery      COUNT 문 함수
     * @param cursorExtractor 커서 idx Getter 함수
     * @param <T>             커서 페이지네이션 결과 DTO
     * @return 커서 페이지네이션 결과
     * @author 임지훈
     */
    default <T> CursorResult<T> createCursorPagination(
        Supplier<List<T>> searchQuery,
        Supplier<Long> countQuery,
        Function<T, Long> cursorExtractor
    ) {
        // SELECT 쿼리 결과 목록
        List<T> data = searchQuery.get();

        // 다음 커서 처리
        Long nextCursor = data.stream()
            .filter(Objects::nonNull)
            .reduce((first, second) -> second) // 마지막 인덱스까지 reduce
            .map(cursorExtractor)
            .orElse(null); // 데이터 없는 경우 null 반환

        // COUNT 쿼리 결과
        Long total = countQuery.get();

        // 커서페이징 결과 DTO 생성
        return new CursorResult<>(
            data,
            nextCursor,
            total
        );
    }

    default <T> CursorResult<T> createCursorPagination(
        Supplier<List<T>> searchQuery,
        Supplier<Long> countQuery,
        Function<T, Long> cursorExtractor,
        Long size
    ) {
        // SELECT 쿼리 결과 목록
        List<T> data = searchQuery.get();

        // 다음 페이지 존재 여부 확인
        boolean hasNext = data.size() > size;

        // 다음 페이지가 있으면 마지막 항목 제거
        if (hasNext) {
            data.remove(data.size() - 1);
        }

        // 다음 커서 처리
        Long nextCursor = hasNext ?
            data.stream()
                .filter(Objects::nonNull)
                .reduce((first, second) -> second) // 마지막 인덱스까지 reduce
                .map(cursorExtractor)
                .orElse(null) // 데이터 없는 경우 null 반환
            : null;

        // COUNT 쿼리 결과
        Long total = countQuery.get();

        // 커서페이징 결과 DTO 생성
        return new CursorResult<>(
            data,
            nextCursor,
            total
        );
    }

    /**
     * @param searchQuery     SELECT 문 함수
     * @param countQuery      COUNT 문 함수
     * @param cursorExtractor 커서 idx Getter 함수
     * @param <T>             커서 페이지네이션 결과 DTO
     * @param <R>             CursorRequest 자식 클래스
     * @return 커서 페이지네이션 결과
     * @author 임지훈
     */
    default <T, R extends CursorSearchRequest> CursorResult<T> createCursorPagination(
        Function<R, List<T>> searchQuery,
        Function<R, Long> countQuery,
        Function<T, Long> cursorExtractor,
        R cursorRequest
    ) {
        // SELECT 쿼리 결과 목록
        List<T> data = searchQuery.apply(cursorRequest);

        // 다음 커서 처리
        Long nextCursor = data.stream()
            .filter(Objects::nonNull)
            .reduce((first, second) -> second) // 마지막 인덱스까지 reduce
            .map(cursorExtractor)
            .orElse(null); // 데이터 없는 경우 null 반환

        // COUNT 쿼리 결과
        Long total = countQuery.apply(cursorRequest);

        // 커서페이징 결과 DTO 생성
        return new CursorResult<>(
            data,
            nextCursor,
            total
        );
    }

    /**
     * @param searchQuery     SELECT 문 함수
     * @param countQuery      COUNT 문 함수
     * @param cursorExtractor 커서 idx Getter 함수
     * @param <T>             커서 페이지네이션 결과 DTO
     * @param <R>             CursorRequest 자식 클래스
     * @param <S>             추가 Request
     * @return 커서 페이지네이션 결과
     * @author 임지훈
     */
    default <T, R extends CursorSearchRequest, S> CursorResult<T> createCursorPagination(
        BiFunction<R, S[], List<T>> searchQuery,
        BiFunction<R, S[], Long> countQuery,
        Function<T, Long> cursorExtractor,
        R cursorRequest,
        S... additionalRequests
    ) {
        // SELECT 쿼리 결과 목록
        List<T> data = searchQuery.apply(cursorRequest, additionalRequests);

        // 다음 커서 처리
        Long nextCursor = data.stream()
            .filter(Objects::nonNull)
            .reduce((first, second) -> second) // 마지막 인덱스까지 reduce
            .map(cursorExtractor)
            .orElse(null); // 데이터 없는 경우 null 반환

        // COUNT 쿼리 결과
        Long total = countQuery.apply(cursorRequest, additionalRequests);

        // 커서페이징 결과 DTO 생성
        return new CursorResult<>(
            data,
            nextCursor,
            total
        );
    }

    default <S, L, R extends SearchRequest> CombinedResult<S, L> createOffsetPagination(
        Supplier<S> singleData,
        Supplier<List<L>> searchQuery,
        Supplier<Long> countQuery,
        R request
    ) {
        S data = singleData.get();
        List<L> list = searchQuery.get();

        PageInfo pageInfo = null;
        if (request.isPaging()) {
            Long count = countQuery.get();
            pageInfo = new PageInfo(request, count);
        }

        CombinedResult<S, L> result = new CombinedResult<>();
        result.setData(data);
        result.setPage(pageInfo);
        result.setList(list);
        return result;
    }


}
