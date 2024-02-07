package com.transmetales.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "compra")
public class Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "id_minero")
    private Integer idminero;
    @Column(name = "id_barra")
    private Integer idbarra;
    private Short mineral;
    private Float gramos;
    @Column(name = "ley_plata")
    private Float leyPlata;
    @Column(name = "ley_oro")
    private Float leyOro;
    private Float precio;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdminero() {
        return idminero;
    }

    public void setIdminero(Integer idminero) {
        this.idminero = idminero;
    }

    public Integer getIdbarra() {
        return idbarra;
    }

    public void setIdbarra(Integer idbarra) {
        this.idbarra = idbarra;
    }

    public Short getMineral() {
        return mineral;
    }

    public void setMineral(Short mineral) {
        this.mineral = mineral;
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

    public void setLeyOro(Float leyOro) {
        this.leyOro = leyOro;
    }
    
    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Compra{" + "id=" + id + ", idminero=" + idminero + ", idbarra=" + idbarra + ", mineral=" + mineral + ", gramos=" + gramos + ", leyPlata=" + leyPlata + ", LeyOro=" + leyOro + ", precio=" + precio + '}';
    }

}
