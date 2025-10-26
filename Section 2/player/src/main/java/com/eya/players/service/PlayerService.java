package com.eya.players.service;

import com.eya.players.dto.PlayerDto;

public interface PlayerService {
    PlayerDto getPlayerById(Long id);
}
