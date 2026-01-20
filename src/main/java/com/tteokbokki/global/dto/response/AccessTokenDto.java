package com.tteokbokki.global.dto.response;

public record AccessTokenDto(String tokenType, String accessToken) {

    public AccessTokenDto(String tokenType, String accessToken) {
        this.tokenType = tokenType;
        this.accessToken = accessToken;
    }

    public String tokenType() {
        return this.tokenType;
    }

    public String accessToken() {
        return this.accessToken;
    }

}
