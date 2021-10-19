package com.baufest.tennis.springtennis.mapper;

import com.baufest.tennis.springtennis.dto.JugadorDTO;
import com.baufest.tennis.springtennis.dto.PartidoDTO;
import com.baufest.tennis.springtennis.model.Jugador;
import com.baufest.tennis.springtennis.model.Partido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class PartidoMapperImpl implements  PartidoMapper{
    @Autowired
    private JugadorMapper jugadorMapper;

    @Override
    public PartidoDTO toDTO(Partido entity) {
        if ( entity == null ) {
            return null;
        }

        PartidoDTO partidoDTO = new PartidoDTO();

        partidoDTO.setId( entity.getId() );
        partidoDTO.setFechaComienzo( entity.getFechaComienzo() );
        partidoDTO.setJugadorLocal(jugadorMapper.toDTO(entity.getJugadorLocal()));
        partidoDTO.setJugadorVisitante(jugadorMapper.toDTO(entity.getJugadorVisitante()));
        partidoDTO.setScoreLocal(entity.getScoreLocal());
        partidoDTO.setPuntosGameActualLocal(entity.getPuntosGameActualLocal());
        partidoDTO.setCantidadGamesLocal(entity.getCantidadGamesLocal());
        partidoDTO.setScoreVisitante(entity.getScoreVisitante());
        partidoDTO.setPuntosGameActualVisitante(entity.getPuntosGameActualVisitante());
        partidoDTO.setCantidadGamesVisitante(entity.getCantidadGamesVisitante());
        partidoDTO.setEstado(entity.getEstado());
        return partidoDTO;
    }

    /* Esta funcion recibe como parametro un JugadorDTO
     * y hacemos un generamos una nueva instancia de Jugador */
    @Override
    public Partido fromDTO(PartidoDTO partidoDTO) {
        if ( partidoDTO == null ) {
            return null;
        }

        Partido partido = new Partido();
        partido.setId( partidoDTO.getId() );
        partido.setFechaComienzo( partidoDTO.getFechaComienzo() );
        partido.setJugadorLocal(jugadorMapper.fromDTO(partidoDTO.getJugadorLocal()));
        partido.setJugadorVisitante(jugadorMapper.fromDTO(partidoDTO.getJugadorVisitante()));
        partido.setScoreLocal(partidoDTO.getScoreLocal());
        partido.setPuntosGameActualLocal(partidoDTO.getPuntosGameActualLocal());
        partido.setCantidadGamesLocal(partidoDTO.getCantidadGamesLocal());
        partido.setScoreVisitante(partidoDTO.getScoreVisitante());
        partido.setPuntosGameActualVisitante(partidoDTO.getPuntosGameActualVisitante());
        partido.setCantidadGamesVisitante(partidoDTO.getCantidadGamesVisitante());
        partido.setEstado(partidoDTO.getEstado());
        return partido;
    }

}
