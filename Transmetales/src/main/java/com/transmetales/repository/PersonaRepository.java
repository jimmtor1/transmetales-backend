package com.transmetales.repository;

import com.transmetales.model.Persona;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

public interface PersonaRepository extends CrudRepository<Persona, Integer> {

    public Optional<Persona> findByNumDocumento(String cedula);
    
}
