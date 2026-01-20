package com.tteokbokki.domain.service;

import com.tteokbokki.domain.dto.GameResponseDto;
import com.tteokbokki.global.dto.response.result.SingleResult;
import com.tteokbokki.global.util.ResponseUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Random;

@Transactional
@Slf4j
@Service
public class GameService {
    private int[][] board = new int[10][10];
    private int totalScore = 0;

    public SingleResult<GameResponseDto> createNewGame() {
        Random rand = new Random();
        totalScore = 0; // 새 게임 시 점수 초기화
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                board[i][j] = rand.nextInt(9) + 1;
            }
        }
        GameResponseDto dto = GameResponseDto.builder()
            .board(board)
            .score(totalScore)
            .message("새 게임이 시작되었습니다!")
            .build();
        return ResponseUtil.getSingleResult(dto);
    }

    public SingleResult<GameResponseDto> checkAndPop() {
        boolean[][] toPop = new boolean[10][10];
        int popCount = 0;

        // 가로/세로 체크 로직 (이전과 동일) ...
        // (생략: 위에서 만든 가로/세로 체크 로직이 여기에 들어갑니다)

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (toPop[i][j]) {
                    board[i][j] = 0;
                    popCount++;
                }
            }
        }

        totalScore += (popCount * 10); // 터진 개수당 10점 추가

        GameResponseDto dto = GameResponseDto.builder()
            .board(board)
            .score(totalScore)
            .message(popCount > 0 ? popCount + "개가 터졌습니다!" : "터질 게 없어요.")
            .build();
        return ResponseUtil.getSingleResult(dto);
    }
}
