package com.tteokbokki.global.enums;

/**
 * 영속 계층의 ENUM 에 대한 인터페이스
 * AbstractCodedEnumConverter 에서 해당 인터페이스를 통해 데이터 변환
 * @see AbstractCodedEnumConverter
 */
public interface CodedEnum<T> {

    T getCode();
}