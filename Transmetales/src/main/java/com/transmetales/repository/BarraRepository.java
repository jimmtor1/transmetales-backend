package com.transmetales.repository;

import com.transmetales.model.Barra;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BarraRepository extends CrudRepository<Barra, Integer> {
    
}
