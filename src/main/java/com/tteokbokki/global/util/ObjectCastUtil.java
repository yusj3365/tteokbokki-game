package com.tteokbokki.global.util;

import lombok.experimental.UtilityClass;

@UtilityClass
public class ObjectCastUtil {

    /**
     * Object를 Long으로 안전하게 변환.
     * 변환 실패 시 null 반환.
     */
    public static Long toLong(Object value) {
        if (value == null) return null;

        if (value instanceof Long) return (Long) value;
        if (value instanceof Number) return ((Number) value).longValue();
        if (value instanceof String) {
            try {
                return Long.parseLong((String) value);
            } catch (NumberFormatException e) {
                return null;
            }
        }
        return null;
    }

    /**
     * Object를 String으로 안전하게 변환.
     * null이면 null 반환.
     */
    public static String toString(Object value) {
        return value != null ? value.toString() : null;
    }
}