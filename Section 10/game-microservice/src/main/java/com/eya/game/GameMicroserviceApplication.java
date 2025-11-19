package com.eya.game;

import com.eya.game.entities.Game;
import com.eya.game.repos.GameRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GameMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GameMicroserviceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(GameRepository gameRepository) {
        return args -> {
            gameRepository.save(Game.builder()
                    .gameName("Silent Hill")
                    .gameGenre("Horror") .build());
            gameRepository.save(Game.builder()
                    .gameName("Super Mario")
                    .gameGenre("Action") .build());
        };
    }

}
