package com.baufest.tennis.springtennis.controller;


import com.baufest.tennis.springtennis.dto.JugadorDTO;
import com.baufest.tennis.springtennis.dto.PartidoDTO;
import com.baufest.tennis.springtennis.service.JugadorService;
import com.baufest.tennis.springtennis.service.PartidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("springtennis/api/v1/partidos")
public class PartidoController {

    private final PartidoService partidoService;

    @Autowired
    public PartidoController(PartidoService partidoService) {
        this.partidoService = partidoService;
    }

    @GetMapping
    public ResponseEntity<List<PartidoDTO>> listAll() {
        return ResponseEntity.ok(partidoService.listAll());
    }


    @GetMapping("/{id}")
    public ResponseEntity<PartidoDTO> getById(@PathVariable Long id) {
        return ResponseEntity.ok(partidoService.getById(id));
    }

    @PostMapping
    public ResponseEntity<PartidoDTO> savePartido(@RequestBody PartidoDTO partido) {
        PartidoDTO savedPartido = partidoService.save(partido);
        return new ResponseEntity<>(savedPartido, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PartidoDTO> updatePartido(@PathVariable Long id, @RequestBody PartidoDTO partido) {
        partido.setId(id);
        PartidoDTO updatedPartido = partidoService.update(partido);
        return ResponseEntity.ok(updatedPartido);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePartido(@PathVariable Long id) {
        partidoService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
