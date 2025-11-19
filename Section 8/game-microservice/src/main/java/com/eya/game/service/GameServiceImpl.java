package com.eya.game.service;


import com.eya.game.dto.GameDto;
import com.eya.game.entities.Game;
import com.eya.game.repos.GameRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class GameServiceImpl implements GameService {

    private GameRepository gameRepository;

    @Override
    public GameDto getGameByGenre(String genre) {
        Game game = gameRepository.findByGameGenre(genre);
        GameDto gameDto = new GameDto(
                game.getId(),
                game.getGameName(),
                game.getGameGenre()
        );
        return gameDto;
    }
}
