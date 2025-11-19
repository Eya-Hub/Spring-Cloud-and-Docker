package com.eya.players.service;

import org.springframework.stereotype.Component;
import com.eya.players.dto.GameDto;

@Component
public class DeptFallBack implements APIClient{

    @Override
    public GameDto getGameByGenre(String gameGenre) {
        return null;
    }
}
