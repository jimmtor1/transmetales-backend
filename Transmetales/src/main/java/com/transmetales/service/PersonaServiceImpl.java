package com.transmetales.service;

import com.transmetales.model.Persona;
import com.transmetales.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;


public class PersonaServiceImpl implements PersonaService{

    @Autowired
    private PersonaRepository personaRepository;
    
    @Override
    public Persona save(Persona persona) {
        return this.personaRepository.save(persona);
    }
   
    
}
