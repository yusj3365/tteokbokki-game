package com.tteokbokki.domain.service;

import com.tteokbokki.domain.dto.GameResponseDto;
import com.tteokbokki.global.dto.response.result.SingleResult;
import com.tteokbokki.global.util.ResponseUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Random;

@Transactional
@Slf4j
@Service
public class GameService {
    private final int ROWS = 17;
    private final int COLS = 10;
    private int[][] board = new int[ROWS][COLS];
    private int totalScore = 0;

    // 1. 새 게임 생성 (17x10)
    public GameResponseDto createNewGame() {
        Random rand = new Random();
        totalScore = 0;
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                board[i][j] = rand.nextInt(9) + 1;
            }
        }
        return GameResponseDto.builder()
            .board(board)
            .score(totalScore)
            .message("17x10 게임이 시작되었습니다! 1분 안에 최대한 많이 터트리세요!")
            .build();
    }

    // 2. 드래그한 좌표들을 받아 터뜨리기
    // coordinates 예시: [[0,0], [0,1], [0,2]] (가로 연속 3개 드래그)
    public GameResponseDto dragAndPop(List<int[]> coordinates) {
        if (coordinates == null || coordinates.size() < 3) {
            return getResponseDto("3개 이상 연결해야 합니다!");
        }

        // 첫 번째 숫자를 기준으로 모두 같은지 확인
        int firstRow = coordinates.get(0)[0];
        int firstCol = coordinates.get(0)[1];
        int targetValue = board[firstRow][firstCol];

        if (targetValue == 0) return getResponseDto("이미 비어있는 칸입니다.");

        for (int[] coord : coordinates) {
            if (board[coord[0]][coord[1]] != targetValue) {
                return getResponseDto("연속된 숫자가 모두 같아야 터집니다!");
            }
        }

        // 터뜨리기 및 점수 계산
        int popCount = coordinates.size();
        for (int[] coord : coordinates) {
            board[coord[0]][coord[1]] = 0;
        }

        // 중력 로직 (터진 자리 채우기)
        applyGravity();

        totalScore += popCount;

        return GameResponseDto.builder()
            .board(board)
            .score(totalScore)
            .message(popCount + "개를 터뜨렸습니다! (현재 점수: " + totalScore + ")")
            .build();
    }

    private void applyGravity() {
        Random rand = new Random();
        for (int j = 0; j < COLS; j++) {
            for (int i = ROWS - 1; i >= 0; i--) {
                if (board[i][j] == 0) {
                    // 위에서 숫자를 끌어옴
                    for (int k = i - 1; k >= 0; k--) {
                        if (board[k][j] != 0) {
                            board[i][j] = board[k][j];
                            board[k][j] = 0;
                            break;
                        }
                    }
                    // 끝까지 숫자가 없으면 새로운 숫자 생성
                    if (board[i][j] == 0) {
                        board[i][j] = rand.nextInt(9) + 1;
                    }
                }
            }
        }
    }

    private GameResponseDto getResponseDto(String msg) {
        return GameResponseDto.builder().board(board).score(totalScore).message(msg).build();
    }
}
