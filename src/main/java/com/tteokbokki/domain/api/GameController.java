package com.tteokbokki.domain.api;

import com.tteokbokki.domain.dto.GameResponseDto;
import com.tteokbokki.domain.service.GameService;
import com.tteokbokki.global.dto.response.SuccessResponse;
import com.tteokbokki.global.dto.response.result.SingleResult;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/game")
public class GameController {

    private final GameService gameService;

    @GetMapping("/start")
    public SuccessResponse<SingleResult<GameResponseDto>> startGame() {
        return SuccessResponse.ok(gameService.createNewGame());
    }

    @GetMapping("/pop")
    public SuccessResponse<SingleResult<GameResponseDto>> popGame() {
        return SuccessResponse.ok(gameService.checkAndPop());
    }
}