package com.eya.players.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class APIResponseDto {
    private PlayerDto playerDto;
    private GameDto gameDto;
}
