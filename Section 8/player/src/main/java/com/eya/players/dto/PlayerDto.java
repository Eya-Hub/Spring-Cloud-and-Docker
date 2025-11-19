package com.eya.players.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlayerDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String gameGenre;
    private String GameName;
}
