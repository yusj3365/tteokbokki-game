package com.tteokbokki.global.enums;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;
import java.util.Objects;

/**
 * DB 와 ORM 간 변환
 *
 * @param <T> ENUM 클래스
 * @param <E> 변환 하고자 하는 클래스
 */
@Converter
@RequiredArgsConstructor
public abstract class AbstractCodedEnumConverter<T extends Enum<T> & CodedEnum<E>, E> implements AttributeConverter<T, E> {

    private final Class<T> clazz;

    @Override
    public E convertToDatabaseColumn(T attribute) {
        if (attribute == null) {
            return null;
        }
        return attribute.getCode();
    }

    @Override
    public T convertToEntityAttribute(E dbData) {
        if (Objects.isNull(dbData)) {
            return null;
        }
        return Arrays.stream(clazz.getEnumConstants())
            .filter(e -> e.getCode().equals(dbData))
            .findFirst()
            .orElseThrow(() -> new IllegalArgumentException("Unknown code: " + dbData));
    }
}

