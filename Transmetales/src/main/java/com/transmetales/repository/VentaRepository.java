package com.transmetales.repository;

import com.transmetales.model.Venta;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VentaRepository extends CrudRepository<Venta, Integer> {
    
}
