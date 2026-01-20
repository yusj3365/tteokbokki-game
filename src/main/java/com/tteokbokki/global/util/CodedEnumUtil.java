package com.tteokbokki.global.util;


import com.tteokbokki.global.enums.CodedEnum;

public class CodedEnumUtil {

    public static <E extends Enum<E> & CodedEnum<T>, T> E fromCode(Class<E> enumClass, T code) {
        if (code == null) {
            return null;
        }
        for (E e : enumClass.getEnumConstants()) {
            if (e.getCode().equals(code)) {
                return e;
            }
        }
        return null;
    }
}