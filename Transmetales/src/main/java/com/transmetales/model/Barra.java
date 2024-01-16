package com.transmetales.model;


public class Barra {
    
    private Integer id;
    private Integer idbarra;
    private Integer idtraslado;
    private Float gramos;
    private Float leyPlata;
    private Float LeyOro;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdbarra() {
        return idbarra;
    }

    public void setIdbarra(Integer idbarra) {
        this.idbarra = idbarra;
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
        return LeyOro;
    }

    public void setLeyOro(Float LeyOro) {
        this.LeyOro = LeyOro;
    }

    @Override
    public String toString() {
        return "Barra{" + "id=" + id + ", idbarra=" + idbarra + ", idtraslado=" + idtraslado + ", gramos=" + gramos + ", leyPlata=" + leyPlata + ", LeyOro=" + LeyOro + '}';
    }
        
}
