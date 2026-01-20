package com.tteokbokki.global.util;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public final class StringConverterUtils {

    public static String safeToString(Integer intValue) {
        return intValue == null ? "" : String.valueOf(intValue);
    }

    public static String safeToString(Double doubleValue) {
        return doubleValue == null ? "" : String.valueOf(doubleValue);
    }

    public static String safeToString(LocalDateTime localDateTime) {
        return localDateTime == null ? ""
            : localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
    }

    public static String safeToString(Long longValue) {
        return longValue == null ? "" : String.valueOf(longValue);
    }

    public static String safeToString(Timestamp timestamp) {
        return timestamp == null ? "" : String.valueOf(timestamp);
    }

    public static String safeToString(String stringValue) {
        return stringValue == null ? "" : stringValue;
    }

    public static String safeToString(BigDecimal bigDecimalValue) {
        return bigDecimalValue == null ? "" : String.valueOf(bigDecimalValue);
    }


    public static String safeToStringWithComma(Long longValue) {
        if (longValue == null) {
            return "";
        }
        return NumberFormat.getNumberInstance(Locale.US).format(longValue);
    }

    public static String safeToStringWithComma(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            return "";
        }
        return NumberFormat.getNumberInstance(Locale.US).format(bigDecimal);
    }

    public static String safeToStringWithComma(Integer intValue) {
        if (intValue == null) {
            return "";
        }
        return NumberFormat.getNumberInstance(Locale.US).format(intValue);
    }

}
