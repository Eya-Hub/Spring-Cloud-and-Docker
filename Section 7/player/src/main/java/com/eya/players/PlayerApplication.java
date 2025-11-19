package com.eya.players;

import com.eya.players.entities.Player;
import com.eya.players.repos.PlayerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@EnableFeignClients
@SpringBootApplication
public class PlayerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlayerApplication.class, args);
	}
	@Bean
	CommandLineRunner commandLineRunner(PlayerRepository playerRepository) {
		return args -> { playerRepository.save(Player.builder()
				.firstName("Eya")
				.lastName("Garali")
				.gameGenre("Action")
				.build());
		};
	}

	@Bean
	public WebClient webClient(){ return WebClient.builder().build();
	}

}
