package com.baufest.tennis.springtennis.mapper;

import com.baufest.tennis.springtennis.dto.JugadorDTO;
import com.baufest.tennis.springtennis.dto.PartidoDTO;
import com.baufest.tennis.springtennis.model.Jugador;
import com.baufest.tennis.springtennis.model.Partido;
import org.springframework.stereotype.Component;

@Component
public interface PartidoMapper {
    PartidoDTO toDTO(Partido entity);
    Partido fromDTO(PartidoDTO entity);

}
