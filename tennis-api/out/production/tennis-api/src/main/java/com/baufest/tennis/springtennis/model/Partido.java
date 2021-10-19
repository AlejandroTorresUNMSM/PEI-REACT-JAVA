package com.baufest.tennis.springtennis.model;

import com.baufest.tennis.springtennis.enums.Estado;
import org.json.JSONObject;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "partido")
public class Partido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private Date fechaComienzo;
    @Column(nullable = false)
    private Estado estado;
    @Column(nullable = false)
    private String jugadorLocal;
    @Column(nullable = false)
    private String jugadorVisitante;
    @Column(nullable = false)
    private int scoreLocal;
    @Column(nullable = false)
    private String puntosGameActualLocal;
    @Column(nullable = false)
    private int cantidadGamesLocal;
    @Column(nullable = false)
    private int scoreVisitante;
    @Column(nullable = false)
    private String puntosGameActualVisitante;
    @Column(nullable = false)
    private int cantidadGamesVisitante;

    public Partido(Long id, Date fechaComienzo, Estado estado, String jugadorLocal, String jugadorVisitante, int scoreLocal, String puntosGameActualLocal, int cantidadGamesLocal, int scoreVisitante, String puntosGameActualVisitante, int cantidadGamesVisitante) {
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

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getJugadorLocal() {
        return jugadorLocal;
    }

    public void setJugadorLocal(String jugadorLocal) {
        this.jugadorLocal = jugadorLocal;
    }

    public String getJugadorVisitante() {
        return jugadorVisitante;
    }

    public void setJugadorVisitante(String jugadorVisitante) {
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
}
