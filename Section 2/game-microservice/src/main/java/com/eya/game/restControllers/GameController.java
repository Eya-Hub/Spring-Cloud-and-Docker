package com.eya.game.restControllers;


import com.eya.game.dto.GameDto;
import com.eya.game.service.GameService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/games")
@AllArgsConstructor
public class GameController {
    private GameService gameService;

    @GetMapping("{genre}")
    public ResponseEntity<GameDto> getGameByGenre(@PathVariable("genre") String genre ){
        return new ResponseEntity<GameDto>(
                gameService.getGameByGenre(genre),
                HttpStatus.OK);
    }
}
