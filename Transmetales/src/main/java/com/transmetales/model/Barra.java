package com.transmetales.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="barra")
public class Barra {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="id_traslado")
    private Integer idtraslado;
    private Float gramos;
    @Column(name="ley_plata")
    private Float leyPlata;
    @Column(name="ley_oro")
    private Float leyOro;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdtraslado() {
        return idtraslado;
    }

    public void setIdtraslado(Integer idtraslado) {
        this.idtraslado = idtraslado;
    }

    public Float getGramos() {
        return gramos;
    }

    public void setGramos(Float gramos) {
        this.gramos = gramos;
    }

    public Float getLeyPlata() {
        return leyPlata;
    }

    public void setLeyPlata(Float leyPlata) {
        this.leyPlata = leyPlata;
    }

    public Float getLeyOro() {
        return leyOro;
    }

    public void setLeyOro(Float LeyOro) {
        this.leyOro = LeyOro;
    }

    @Override
    public String toString() {
        return "Barra{" + "id=" + id + ", idtraslado=" + idtraslado + ", gramos=" + gramos + ", leyPlata=" + leyPlata + ", leyOro=" + leyOro + '}';
    }
        
}
