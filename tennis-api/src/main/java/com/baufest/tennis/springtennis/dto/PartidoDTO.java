package com.baufest.tennis.springtennis.dto;

import com.baufest.tennis.springtennis.enums.Estado;
import com.baufest.tennis.springtennis.model.Jugador;
import org.json.JSONObject;

import java.util.Date;

public class PartidoDTO {
    private Long id;
    private Date fechaComienzo;
    private Estado estado;
    private JugadorDTO jugadorLocal;
    private JugadorDTO jugadorVisitante;
    private int scoreLocal;
    private String puntosGameActualLocal;
    private int cantidadGamesLocal;
    private int scoreVisitante;
    private String puntosGameActualVisitante;
    private int cantidadGamesVisitante;

    public PartidoDTO() {
    }

    public PartidoDTO(Long id, Date fechaComienzo, Estado estado, JugadorDTO jugadorLocal, JugadorDTO jugadorVisitante, int scoreLocal, String puntosGameActualLocal, int cantidadGamesLocal, int scoreVisitante, String puntosGameActualVisitante, int cantidadGamesVisitante) {
        this.id = id;
        this.fechaComienzo = fechaComienzo;
        this.estado = estado;
        this.jugadorLocal = jugadorLocal;
        this.jugadorVisitante = jugadorVisitante;
        this.scoreLocal = scoreLocal;
        this.puntosGameActualLocal = puntosGameActualLocal;
        this.cantidadGamesLocal = cantidadGamesLocal;
        this.scoreVisitante = scoreVisitante;
        this.puntosGameActualVisitante = puntosGameActualVisitante;
        this.cantidadGamesVisitante = cantidadGamesVisitante;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFechaComienzo() {
        return fechaComienzo;
    }

    public void setFechaComienzo(Date fechaComienzo) {
        this.fechaComienzo = fechaComienzo;
    }

    public JugadorDTO getJugadorLocal() {
        return jugadorLocal;
    }

    public void setJugadorLocal(JugadorDTO jugadorLocal) {
        this.jugadorLocal = jugadorLocal;
    }

    public JugadorDTO getJugadorVisitante() {
        return jugadorVisitante;
    }

    public void setJugadorVisitante(JugadorDTO jugadorVisitante) {
        this.jugadorVisitante = jugadorVisitante;
    }

    public int getScoreLocal() {
        return scoreLocal;
    }

    public void setScoreLocal(int scoreLocal) {
        this.scoreLocal = scoreLocal;
    }

    public String getPuntosGameActualLocal() {
        return puntosGameActualLocal;
    }

    public void setPuntosGameActualLocal(String puntosGameActualLocal) {
        this.puntosGameActualLocal = puntosGameActualLocal;
    }

    public int getCantidadGamesLocal() {
        return cantidadGamesLocal;
    }

    public void setCantidadGamesLocal(int cantidadGamesLocal) {
        this.cantidadGamesLocal = cantidadGamesLocal;
    }

    public int getScoreVisitante() {
        return scoreVisitante;
    }

    public void setScoreVisitante(int scoreVisitante) {
        this.scoreVisitante = scoreVisitante;
    }

    public String getPuntosGameActualVisitante() {
        return puntosGameActualVisitante;
    }

    public void setPuntosGameActualVisitante(String puntosGameActualVisitante) {
        this.puntosGameActualVisitante = puntosGameActualVisitante;
    }

    public int getCantidadGamesVisitante() {
        return cantidadGamesVisitante;
    }

    public void setCantidadGamesVisitante(int cantidadGamesVisitante) {
        this.cantidadGamesVisitante = cantidadGamesVisitante;
    }

    public JSONObject toJSONObject() {
        JSONObject jo = new JSONObject();
        jo.put("id",getId());
        jo.put("fecha",getFechaComienzo());
        jo.put("local",getJugadorLocal());
        jo.put("visitante",getJugadorVisitante());
        jo.put("Score Local",getScoreLocal());
        jo.put("Puntos Game Actual Local",getPuntosGameActualLocal());
        jo.put("Cantidad Game Local",getCantidadGamesLocal());
        jo.put("Score Visitante",getScoreVisitante());
        jo.put("Puntos game Actual Visitante",getCantidadGamesVisitante());
        jo.put("Cantidad local visitante",getCantidadGamesVisitante());
        return jo;
    }

}
