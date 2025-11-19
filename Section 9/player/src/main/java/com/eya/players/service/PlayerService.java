package com.eya.players.service;

import com.eya.players.dto.APIResponseDto;
import com.eya.players.dto.PlayerDto;

public interface PlayerService {
    APIResponseDto getPlayerById(Long id);
}
