package com.eya.players.service;


import com.eya.players.dto.GameDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "http://localhost:8080", value = "GAME")
public interface APIClient {
    @GetMapping("api/games/{game-genre}")
    GameDto getGameByGenre(@PathVariable("game-genre")
                               String gameGenre
    );
}
