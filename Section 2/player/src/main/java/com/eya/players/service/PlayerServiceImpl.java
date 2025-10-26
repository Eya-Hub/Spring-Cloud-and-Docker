package com.eya.players.service;


import com.eya.players.dto.PlayerDto;
import com.eya.players.entities.Player;
import com.eya.players.repos.PlayerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class PlayerServiceImpl implements PlayerService {
    private PlayerRepository playerRepository;

    @Override public PlayerDto getPlayerById(Long id) {
        Player player = playerRepository.findById(id).get();
        return new PlayerDto(
                player.getId(),
                player.getFirstName(),
                player.getLastName()
        );
    }
}
