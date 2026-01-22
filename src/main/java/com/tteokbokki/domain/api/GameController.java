package com.tteokbokki.domain.api;

import com.tteokbokki.domain.dto.GameResponseDto;
import com.tteokbokki.domain.service.GameService;
import com.tteokbokki.global.dto.response.SuccessResponse;
import com.tteokbokki.global.dto.response.result.SingleResult;
import com.tteokbokki.global.util.ResponseUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/game")
public class GameController {

    private final GameService gameService;

    @GetMapping("/start")
    public SuccessResponse<SingleResult<GameResponseDto>> startGame() {
        return SuccessResponse.ok(ResponseUtil.getSingleResult(gameService.createNewGame()));
    }

    @GetMapping("/pop")
    public SuccessResponse<SingleResult<GameResponseDto>> popGame(@RequestBody List<int[]> coordinates) {
        return SuccessResponse.ok(ResponseUtil.getSingleResult(gameService.dragAndPop(coordinates)));
    }
}