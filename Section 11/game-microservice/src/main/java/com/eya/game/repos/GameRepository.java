package com.eya.game.repos;

import com.eya.game.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long>{
    Game findByGameGenre(String code);
}
