package com.tteokbokki.global.util;

public final class ConverterUtils {

    public static String convertMeIsAllow(Integer meIsAllow) {
        if (meIsAllow == null) {
            return "";
        }
        return switch (meIsAllow) {
            case 0 -> "승인대기";
            case 1 -> "승인중";
            case 2 -> "반려";
            default -> "";
        };
    }
}
