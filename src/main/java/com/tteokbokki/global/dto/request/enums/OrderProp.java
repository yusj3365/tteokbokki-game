package com.tteokbokki.global.dto.request.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum OrderProp {
    idx,
    createdAt,
    purchaseCreatedAt, // 구매일
    extraCreatedAt,
    seq,
    deletedAt,
    updatedAt,
    // --- 미디어 관련 -----//
    allowDate,    // m.m_allow_date
    hitHistory,   // hit_history
    keyword,       // search_keyword
    channel, // mcChannel
    episode, // dgm_media_series_content.msc_episode
    totalViews,// avg_total_views
    uniqueViews,// avg_unique_views
    history,
    setting,
    //---- 채널 관련 ----- //
    csStartTime,

    //---- 주문 관련 ----- //
    oreRequireAt,
    otRequireAt,

    //----멤버 파트너 관련 --- //
    outCreatedAt,

    // 회원 관련
    mbJoinDate, // 가입일

    // 마케팅 활용 수신 동의일
    marketingDateAt,

    // 경품 관련
    prPrice,

    // 배송지 관련
    mdIsDefault
}
