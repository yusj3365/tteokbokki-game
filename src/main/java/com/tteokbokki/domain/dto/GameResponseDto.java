package com.tteokbokki.domain.dto;

import com.tteokbokki.global.dto.response.SuccessResponse;
import com.tteokbokki.global.dto.response.result.ListResult;
import lombok.Builder;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.Transactional;

import java.util.Random;

@Getter
@Builder
public class GameResponseDto {
    private int[][] board;   // 게임판 상태
    private int score;       // 현재 점수
    private String message;  // "3개 터짐!" 같은 알림 메시지
}