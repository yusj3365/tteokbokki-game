package com.tteokbokki.global.dto.response;

import com.tteokbokki.global.exception.ErrorCode;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ErrorResponse<T> {

    @Schema(description = "성공 여부", nullable = false, example = "false")
    private boolean success = false;

    @Schema(description = "예외 코드", nullable = false, example = "-100")
    private int code;

    @Schema(description = "예외 메세지", nullable = false, example = "예외 메세지")
    private String message;

    @Schema(description = "예외 참고 데이터", nullable = false)
    private T result;

    @Schema(description = "예외에 포함된 추가 숫자 값", nullable = true)
    private Long customValue;

    public ErrorResponse(int code, String message, T result, Long customValue) {
        this.code = code;
        this.message = message;
        this.result = result;
        this.customValue = customValue;
    }

    public static <T> ErrorResponse<T> of(int code, String message) {
        return new ErrorResponse<>(code, message, null, null);
    }

    public static <T> ErrorResponse<T> of(ErrorCode errorCode) {
        return new ErrorResponse<>(errorCode.getErrorCode(), errorCode.getMessage(), null, null);
    }

    public static <T> ErrorResponse<T> of(int code, String message, T data) {
        return new ErrorResponse<>(code, message, data, null);
    }

    public static <T> ErrorResponse<T> of(ErrorCode errorCode, T data) {
        return new ErrorResponse<>(errorCode.getErrorCode(), errorCode.getMessage(), data, null);
    }

    public static <T> ErrorResponse<T> of(ErrorCode errorCode, T data, Long longValue) {
        return new ErrorResponse<>(errorCode.getErrorCode(), errorCode.getMessage(), data,
            longValue);
    }

}
