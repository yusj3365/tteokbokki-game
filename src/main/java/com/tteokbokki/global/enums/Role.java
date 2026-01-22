package com.tteokbokki.global.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Getter
@RequiredArgsConstructor
public enum Role {

    NORMAL("ROLE_NORMAL"),
    USER_NOT_VALID("ROLE_USER_NOT_VALID"),
    //    ADMIN("ROLE_ADMIN"),
    SUPER_ADMIN("ROLE_ADMIN"),
    NORMAL_ADMIN("ROLE_ADMIN"),
    ;
    //fullRoleName을 통해 super , normal admin을 구별할 수 없다. fullRoleName 의미 확인 필요

    // static map 캐시
    private static final Map<String, Role> FULL_NAME_MAP =
        Stream.of(values()).collect(Collectors.toMap(Role::getRoleName, r -> r));
    private final String fullRoleName;

    public static Role fromRoleName(String fullRoleName) {
        return FULL_NAME_MAP.get(fullRoleName);
    }


    public String getRoleName() {
        return this.name();
    }

}
