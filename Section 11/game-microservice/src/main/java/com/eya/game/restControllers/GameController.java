package com.eya.game.restControllers;


import com.eya.game.config.Configuration;
import com.eya.game.dto.GameDto;
import com.eya.game.service.GameService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/games")
public class GameController {
    private GameService gameService;

//    @Value("${build.version}")
//    private String buildVersion;
//
//    @Autowired
//    Configuration configuration;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping("{genre}")
    public ResponseEntity<GameDto> getGameByGenre(@PathVariable("genre") String genre ){
        return new ResponseEntity<GameDto>(
                gameService.getGameByGenre(genre),
                HttpStatus.OK);
    }


//    @GetMapping("/version")
//    public ResponseEntity<String> version() {
//        return ResponseEntity.status(HttpStatus.OK).body(buildVersion);
//    }
//
//    @GetMapping("/author")
//    public ResponseEntity<String> retrieveAuthorInfo() {
//        return ResponseEntity.status(HttpStatus.OK)
//                .body(configuration.getName()+" "+configuration.getEmail() );
//    }
}
