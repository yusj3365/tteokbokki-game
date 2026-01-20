package com.tteokbokki.global.dto.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class SortData {

    private String prop;
    private String dir;

}
