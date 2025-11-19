package com.eya.players.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.eya.players.entities.Player;

public interface PlayerRepository extends JpaRepository<Player, Long> {

}
