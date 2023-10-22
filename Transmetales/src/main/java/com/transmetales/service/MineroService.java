package com.transmetales.service;

import com.transmetales.model.Minero;
import java.util.List;

public interface MineroService {
    
    public List<Minero> getAll();
    public Minero save(Minero minero);
    public Minero edit(Minero minero);
    public Minero getOne(Integer id);
    public boolean deleteOne(Integer Id);
        
}
