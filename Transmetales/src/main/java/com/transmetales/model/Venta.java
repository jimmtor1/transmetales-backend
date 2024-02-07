package com.transmetales.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="venta")
public class Venta {
   
    @Id
    private Integer id;
    @Column(name="id_traslado")
    private Integer idtraslado;
    @Column(name="id_cliente")
    private Integer idcliente;

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

    public Integer getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(Integer idcliente) {
        this.idcliente = idcliente;
    }

    @Override
    public String toString() {
        return "Venta{" + "id=" + id + ", idtraslado=" + idtraslado + ", idcliente=" + idcliente + '}';
    }
    
    
    
}
