package com.tteokbokki.global.exception;

import lombok.Getter;

@Getter
public class CustomException extends RuntimeException {

    private final Exception originException;
    private final ErrorCode errorCode;
    private final String message;
    private final String additionalInfo;
    private final Long longValue;

    public CustomException(ErrorCode errorCode, Exception originException, String additionalInfo,
        Long longValue) {
        this.errorCode = errorCode;
        this.originException = originException;
        this.message = errorCode.getMessage();
        this.additionalInfo = additionalInfo;
        this.longValue = longValue;
    }

    // 1. 기본 생성자: (ErrorCode만 사용)
    public CustomException(ErrorCode errorCode) {
        // null, null, null을 마스터 생성자에 넘겨 초기화 체이닝
        this(errorCode, null, null, null);
    }

    // 2. 추가 메시지 생성자
    public CustomException(ErrorCode errorCode, String additionalMessage) {
        // originException=null, integerValue=null로 초기화 체이닝
        this(errorCode, null, additionalMessage, null);
    }

    // 3. 예외(Exception) 포함 생성자
    public CustomException(ErrorCode errorCode, Exception exception) {
        // additionalInfo=null, integerValue=null로 초기화 체이닝
        this(errorCode, exception, null, null);
    }

    // 4. integerValue 포함 생성자 (원래 마스터 생성자였지만, 체이닝을 위해 순서 재배치)
    public CustomException(ErrorCode errorCode, String additionalMessage, Long longValue) {
        // originException=null로 초기화 체이닝
        this(errorCode, null, additionalMessage, longValue);
    }
}
