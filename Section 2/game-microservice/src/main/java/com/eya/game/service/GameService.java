package com.eya.game.service;

import com.eya.game.dto.GameDto;

public interface GameService {
    GameDto getGameByGenre(String genre);
}
