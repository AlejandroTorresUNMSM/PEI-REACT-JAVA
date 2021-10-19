package com.baufest.tennis.springtennis.service;

import com.baufest.tennis.springtennis.dto.PartidoDTO;
import com.baufest.tennis.springtennis.mapper.PartidoMapper;
import com.baufest.tennis.springtennis.repository.PartidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
@Service
public class PartidoServiceImpl  implements  PartidoService{
    //String que se utilizan para las respuestas de los exception handler
    public static final String MATCH_WITH_ID = "Match with id = ";
    public static final String DOES_NOT_EXIST = " does not exist.";
    public static final String ALREADY_EXISTS = " already exists.";

    private final PartidoRepository partidoRepository;
    private final PartidoMapper partidoMapper;

    @Autowired
    public PartidoServiceImpl(PartidoRepository partidoRepository, PartidoMapper partidoMapper){
        this.partidoRepository = partidoRepository;
        this.partidoMapper = partidoMapper;
    }

    @Override
    public List<PartidoDTO> listAll() {
        return partidoRepository.findAll().stream()
                .map(this.partidoMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public PartidoDTO getById(Long id) {
        return partidoRepository.findById(id).map(this.partidoMapper::toDTO)
                .orElseThrow(() -> new NoSuchElementException(MATCH_WITH_ID + id + DOES_NOT_EXIST));
    }

    @Override
    public PartidoDTO save(PartidoDTO partido) {

        boolean exists = partido.getId() != null && partidoRepository.existsById(partido.getId());
        if (exists) { //Si existe arroja una nueva excepcion del tipo IllegalArgumentException
            throw new IllegalArgumentException(MATCH_WITH_ID + partido.getId() + ALREADY_EXISTS);
        }

        return this.partidoMapper.toDTO(partidoRepository.save(this.partidoMapper.fromDTO(partido)));
    }

    @Override
    public PartidoDTO update(PartidoDTO partido) {
        boolean exists = partidoRepository.existsById(partido.getId());
        if (!exists) {
            throw new NoSuchElementException(MATCH_WITH_ID + partido.getId() + DOES_NOT_EXIST);
        }
        return this.partidoMapper.toDTO(partidoRepository.save(this.partidoMapper.fromDTO(partido)));
    }

    @Override
    public void delete(Long id) {
        boolean exists = partidoRepository.existsById(id);
        if (!exists) {
            throw new NoSuchElementException(MATCH_WITH_ID + id + DOES_NOT_EXIST);
        }
        partidoRepository.deleteById(id);
    }

}
