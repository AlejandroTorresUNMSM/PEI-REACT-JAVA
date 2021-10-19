package com.baufest.tennis.springtennis.service;

import com.baufest.tennis.springtennis.dto.PartidoDTO;
import com.baufest.tennis.springtennis.mapper.PartidoMapper;
import com.baufest.tennis.springtennis.model.Partido;
import com.baufest.tennis.springtennis.repository.PartidoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface PartidoService {
    List<PartidoDTO> listAll();
    PartidoDTO getById(Long id);
    PartidoDTO save(PartidoDTO partido);
    PartidoDTO update(PartidoDTO jugador);
    void delete(Long id);


}
