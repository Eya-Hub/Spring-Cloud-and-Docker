package com.eya.players.restControllers;


import com.eya.players.dto.APIResponseDto;
import com.eya.players.dto.PlayerDto;
import com.eya.players.service.PlayerService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/players")
@AllArgsConstructor
public class PlayerController {

    private PlayerService playersService;

    @GetMapping("{id}")
    public ResponseEntity<APIResponseDto> getPlayerById(@PathVariable("id") Long id ){
        return new ResponseEntity<APIResponseDto>(
                playersService.getPlayerById(id), HttpStatus.OK);
    }
}
