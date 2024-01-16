package com.transmetales.model;

public class Compra {
    
    private Integer id;
    private Integer idminero;
    private Integer idbarra;
    private Short mineral;
    private Float gramos;
    private Float leyPlata;
    private Float LeyOro;
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
        return LeyOro;
    }

    public void setLeyOro(Float LeyOro) {
        this.LeyOro = LeyOro;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Compra{" + "id=" + id + ", idminero=" + idminero + ", idbarra=" + idbarra + ", mineral=" + mineral + ", gramos=" + gramos + ", leyPlata=" + leyPlata + ", LeyOro=" + LeyOro + ", precio=" + precio + '}';
    }
    
        
}
