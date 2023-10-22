package com.transmetales.service;

import com.transmetales.model.Minero;
import com.transmetales.model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import com.transmetales.repository.MineroRepository;
import com.transmetales.repository.PersonaRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class MineroServiceImpl implements MineroService {
    
    @Autowired
    private MineroRepository mineroRepository;
    
    @Autowired
    private PersonaRepository personaRepository;
    
    
    @Override
    public List<Minero> getAll() {
        return mineroRepository.findAll();
    }    
    
    @Override
    @Transactional
    public Minero save(Minero minero) {
        return mineroRepository.save(minero);
    }
    
    @Override
    @Transactional
    public Minero edit(Minero minero) { 
        
        if(this.personaRepository.existsById(minero.getId())){
            Persona persona = minero.getPersona();
            persona.setMinero(minero);
            return personaRepository.save(persona).getMinero();
        }else{
            return null;
        }
       
    }
    
    

    @Override
    public Minero getOne(Integer id) {
        return this.mineroRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public boolean deleteOne(Integer id) {              
        this.personaRepository.deleteById(id);
        return personaRepository.existsById(id);
    }

    
}
