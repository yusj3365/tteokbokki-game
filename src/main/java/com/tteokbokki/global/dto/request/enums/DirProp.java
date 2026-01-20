package com.tteokbokki.global.dto.request.enums;

import com.querydsl.core.types.Order;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum DirProp {

    asc(Order.ASC),
    desc(Order.DESC);

    private final Order order;

}
