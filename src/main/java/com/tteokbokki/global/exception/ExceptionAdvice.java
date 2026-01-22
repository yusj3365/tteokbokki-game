package com.tteokbokki.global.exception;

import com.tteokbokki.global.dto.response.ErrorResponse;
import com.tteokbokki.global.dto.response.result.ExceptionResult;
import com.tteokbokki.global.dto.response.result.ExceptionResult.ServerErrorData;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.web.servlet.NoHandlerFoundException;
import org.springframework.web.servlet.resource.NoResourceFoundException;

import java.util.ArrayList;
import java.util.List;


@Slf4j
@RequiredArgsConstructor
@RestControllerAdvice
public class ExceptionAdvice {

    @ExceptionHandler(NoResourceFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorResponse<String> handleNoResourceFoundException(NoResourceFoundException e) {
        log.warn("[NO RESOURCE FOUND] message: [{}]", e.getMessage());
        return ErrorResponse.of(ErrorCode.NOT_FOUND_PATH, e.getMessage());
    }
    /**
     * 등록되지 않은 예외
     */
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    protected ErrorResponse<ServerErrorData> handleUntrackedException(Exception e) {
        log.error("[UNTRACKED ERROR] class: [{}], message: [{}]",
            e.getClass().getSimpleName(),
            e.getMessage());

        ExceptionResult.ServerErrorData serverErrorData = ExceptionResult.ServerErrorData.builder()
            .errorClass(e.getClass().toString())
            .errorMessage(e.getMessage())
            .build();
        return ErrorResponse.of(ErrorCode.SERVER_UNTRACKED_ERROR, serverErrorData);
    }

    /**
     * 파라미터 검증 예외
     */
    @ExceptionHandler({MethodArgumentNotValidException.class})
    @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
    public ErrorResponse<List<ExceptionResult.ParameterData>> handleValidationExceptions(
        MethodArgumentNotValidException e) {
        log.warn(
            "[PARAMETER VALIDATION EXCEPTION] class: [{}], message: [{}], localizedMessage: [{}]",
            e.getClass().getSimpleName(),
            e.getMessage(),
            e.getLocalizedMessage());

        List<ExceptionResult.ParameterData> list = new ArrayList<>();

        BindingResult bindingResult = e.getBindingResult();
        for (FieldError fieldError : bindingResult.getFieldErrors()) {
            ExceptionResult.ParameterData parameterData = ExceptionResult.ParameterData.builder()
                .key(fieldError.getField())
                .value(fieldError.getRejectedValue() == null ? null
                    : fieldError.getRejectedValue().toString())
                .reason(fieldError.getDefaultMessage())
                .build();
            list.add(parameterData);
        }

        return ErrorResponse.of(ErrorCode.PARAMETER_VALIDATION_ERROR, list);
    }

    /**
     * 파라미터 문법 예외
     */
    @ExceptionHandler({HttpMessageNotReadableException.class})
    @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
    public ErrorResponse<String> handleHttpMessageParsingExceptions(
        HttpMessageNotReadableException e) {
        log.warn("[PARAMETER GRAMMAR EXCEPTION] class: [{}], message: [{}]",
            e.getClass().getSimpleName(),
            e.getMessage());

        return ErrorResponse.of(ErrorCode.PARAMETER_GRAMMAR_ERROR);
    }

    /**
     * 매개변수 타입 예외
     */
    @ExceptionHandler({MethodArgumentTypeMismatchException.class})
    @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
    public ErrorResponse<String> handleHttpMessageParsingExceptions(
        MethodArgumentTypeMismatchException e) {
        log.warn("[METHOD ARGUMENT TYPE EXCEPTION] class: [{}], message: [{}]",
            e.getClass().getSimpleName(),
            e.getMessage());

        return ErrorResponse.of(ErrorCode.INVALID_PARAMETER, e.getMessage());
    }

    /**
     * 커스텀 예외
     */
    @ExceptionHandler(CustomException.class)
    public ResponseEntity<ErrorResponse<Object>> handleCustomExceptions(CustomException e) {
        ErrorCode errorCode = e.getErrorCode();

        if (e.getOriginException() != null) {
            log.error("[ORIGIN ERROR] class: [{}], message: [{}], localizedMessage: [{}]",
                e.getOriginException().getClass().getSimpleName(),
                e.getOriginException().getMessage(),
                e.getOriginException().getLocalizedMessage());
        }
        log.warn("[CUSTOM EXCEPTION] class: [{}], message: [{}]",
            e.getClass().getSimpleName(),
            errorCode.getMessage());

        ErrorResponse<Object> body = ErrorResponse.of(errorCode, e.getAdditionalInfo(),
            e.getLongValue());
        HttpStatus httpStatus = HttpStatus.valueOf(errorCode.getHttpCode());
        return new ResponseEntity<>(body, httpStatus);
    }

    /**
     * 잘못된 입력값
     */
    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<ErrorResponse<String>> handleIllegalArgumentException(
        IllegalArgumentException e) {
        ErrorResponse<String> body = ErrorResponse.of(ErrorCode.INVALID_INPUT, e.getMessage());
        HttpStatus httpStatus = HttpStatus.valueOf(ErrorCode.INVALID_INPUT.getHttpCode());
        return new ResponseEntity<>(body, httpStatus);
    }

    /**
     * 경로 존재하지 않음
     */
    @ExceptionHandler(NoHandlerFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<ErrorResponse<String>> handleInvalidPathExceptions(
        NoHandlerFoundException e) {
        ErrorResponse<String> body = ErrorResponse.of(ErrorCode.NOT_FOUND_PATH, e.getMessage());
        HttpStatus httpStatus = HttpStatus.valueOf(ErrorCode.NOT_FOUND_PATH.getHttpCode());
        return new ResponseEntity<>(body, httpStatus);
    }

}
