package com.transmetales.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cliente")
public class Cliente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="id_persona")
    private Integer idpersona;
    @Column(name="num_rucom")    
    private String numRucom;
    @Column(name="tipo_regimen")
    private Short tipoRegimen;
    private Boolean estado;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(Integer idpersona) {
        this.idpersona = idpersona;
    }

    public String getNumRucom() {
        return numRucom;
    }

    public void setNumRucom(String numRucom) {
        this.numRucom = numRucom;
    }

    public Short getTipoRegimen() {
        return tipoRegimen;
    }

    public void setTipoRegimen(Short tipoRegimen) {
        this.tipoRegimen = tipoRegimen;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", idpersona=" + idpersona + ", numRucom=" + numRucom + ", tipoRegimen=" + tipoRegimen + ", estado=" + estado + '}';
    }
    
    
    
}
