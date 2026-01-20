package com.tteokbokki.global.dto.response.result;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

public class ExceptionResult {

    @Getter
    @Setter
    @Builder
    public static class ParameterData {

        private String key;
        private String value;
        private String reason;
    }

    @Getter
    @Setter
    @Builder
    public static class ServerErrorData {

        private String errorClass;
        private String errorMessage;
    }
}
