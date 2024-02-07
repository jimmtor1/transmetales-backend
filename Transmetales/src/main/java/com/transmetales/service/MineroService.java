package com.transmetales.service;

import com.transmetales.model.Minero;
import com.transmetales.model.Persona;
import java.util.List;
import java.util.Optional;

public interface MineroService {
    
    public List<Minero> getAll();
    public Minero save(Minero minero);
    public Minero edit(Minero minero);
    public Minero getOne(Integer id);
    public Optional<Persona> getOneByCedula(String cedula);
    public boolean deleteOne(Integer Id);
        
}
