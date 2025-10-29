package com.eya.players.service;


import com.eya.players.dto.APIResponseDto;
import com.eya.players.dto.GameDto;
import com.eya.players.dto.PlayerDto;
import com.eya.players.entities.Player;
import com.eya.players.repos.PlayerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@AllArgsConstructor
@Service
public class PlayerServiceImpl implements PlayerService {
    private PlayerRepository playerRepository;
    // private WebClient webClient;

    private APIClient apiClient;

    @Override
    public APIResponseDto getPlayerById(Long id) {
        Player player = playerRepository.findById(id).get();

        /*GameDto gameDto = webClient.get()
                .uri("http://localhost:8080/api/games/" + player.getGameGenre())
                .retrieve()
                .bodyToMono(GameDto.class)
                .block();*/

        GameDto gameDto = apiClient.getGameByGenre(player.getGameGenre());

        PlayerDto playerDto = new PlayerDto(
                player.getId(),
                player.getFirstName(),
                player.getLastName(),
                player.getGameGenre(),
                gameDto.getGameName()
        );

        APIResponseDto apiResponseDto = new APIResponseDto();
        apiResponseDto.setPlayerDto(playerDto);
        apiResponseDto.setGameDto(gameDto);

        return apiResponseDto;
    }
}
