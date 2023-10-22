
package com.transmetales.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "minero")
public class Minero implements Serializable{   
    
    private static final long serialVersionUID = 1L;
    
    @Id
    private Integer id; // Utiliza el mismo id que Persona
    
//    @Column(name = "id_persona")
//    private Integer idPersona;
    
    @Column(name = "tipo_minero")
    private short tipoMinero;
    
    @Column(name = "vencimiento_rut")
    private Date vencimientoRut;
    
    @Column(name = "certificacion_alcaldia")
    private Date certificacionAlcaldia;
    
    private boolean estado = true;
    
    @Column(name = "gramos_comprados")
    private float gramosComprados;
    
    @OneToOne
    @JoinColumn(name = "id")
    @MapsId
    private Persona persona;

    public Minero() {
    }

    public Minero(Integer id, short tipoMinero, Date vencimientoRut, Date certificacionAlcaldia, float gramosComprados, Persona persona) {
        this.id = id;
        this.tipoMinero = tipoMinero;
        this.vencimientoRut = vencimientoRut;
        this.certificacionAlcaldia = certificacionAlcaldia;        
        this.gramosComprados = gramosComprados;
        this.persona = persona;
    }

   
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

   
    public short getTipoMinero() {
        return tipoMinero;
    }

    public void setTipoMinero(short tipoMinero) {
        this.tipoMinero = tipoMinero;
    }

    public Date getVencimientoRut() {
        return vencimientoRut;
    }

    public void setVencimientoRut(Date vencimientoRut) {
        this.vencimientoRut = vencimientoRut;
    }

    public Date getCertificacionAlcaldia() {
        return certificacionAlcaldia;
    }

    public void setCertificacionAlcaldia(Date certificacionAlcaldia) {
        this.certificacionAlcaldia = certificacionAlcaldia;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public float getGramosComprados() {
        return gramosComprados;
    }

    public void setGramosComprados(float gramosComprados) {
        this.gramosComprados = gramosComprados;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "Minero{" + "id=" + id + ", tipoMinero=" + tipoMinero + ", vencimientoRut=" + vencimientoRut + ", certificacionAlcaldia=" + certificacionAlcaldia + ", estado=" + estado + ", gramosComprados=" + gramosComprados + ", persona=" + persona + '}';
    }

   
    
    
    
}
