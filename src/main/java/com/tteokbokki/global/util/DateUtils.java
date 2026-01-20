package com.tteokbokki.global.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtils {

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    /**
     * 프로모션 진행 기간을 "yyyy-MM-dd ~ yyyy-MM-dd" 형식으로 반환 둘 중 하나만 존재할 경우: 단독 날짜만 출력 둘 다 null일 경우: 빈 문자열
     * 반환
     */
    public static String convertToDateRange(LocalDateTime start, LocalDateTime end) {
        boolean hasStart = start != null;
        boolean hasEnd = end != null;

        if (!hasStart && !hasEnd) {
            return "";
        }

        if (hasStart && hasEnd) {
            return FORMATTER.format(start) + " ~ " + FORMATTER.format(end);
        } else if (hasStart) {
            return FORMATTER.format(start) + " ~";
        } else {
            return "~ " + FORMATTER.format(end);
        }
    }
}
