package com.transmetales.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name="traslado")
public class Traslado {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;   
    @Column(name="recibido_por")
    private String recibido;
    private Boolean estado;
    @Column(name="fecha_envio")
    private LocalDate fechaEnvio;
    @Column(name="fecha_recepcion")
    private LocalDate fechaRecepcion;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public LocalDate getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(LocalDate fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public LocalDate getFechaRecepcion() {
        return fechaRecepcion;
    }

    public void setFechaRecepcion(LocalDate fechaRecepcion) {
        this.fechaRecepcion = fechaRecepcion;
    }
  
    @Override
    public String toString() {
        return "Traslado{" + "id=" + id + ", recibido=" + recibido + ", estado=" + estado + ", fecha_envio=" + fechaEnvio + ", fecha_recepcion=" + fechaRecepcion + '}';
    }
    
    
}
