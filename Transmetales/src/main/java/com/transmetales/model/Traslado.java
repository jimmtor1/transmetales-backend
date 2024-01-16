package com.transmetales.model;

import java.time.LocalDate;

public class Traslado {
    
    private Integer id;
    private Integer idbarra;
    private String recibido;
    private Boolean estado;
    private LocalDate fecha_envio;
    private LocalDate fecha_recepcion;

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

    public String getRecibido() {
        return recibido;
    }

    public void setRecibido(String recibido) {
        this.recibido = recibido;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public LocalDate getFecha_envio() {
        return fecha_envio;
    }

    public void setFecha_envio(LocalDate fecha_envio) {
        this.fecha_envio = fecha_envio;
    }

    public LocalDate getFecha_recepcion() {
        return fecha_recepcion;
    }

    public void setFecha_recepcion(LocalDate fecha_recepcion) {
        this.fecha_recepcion = fecha_recepcion;
    }

    @Override
    public String toString() {
        return "Traslado{" + "id=" + id + ", idbarra=" + idbarra + ", recibido=" + recibido + ", estado=" + estado + ", fecha_envio=" + fecha_envio + ", fecha_recepcion=" + fecha_recepcion + '}';
    }
    
    
}
