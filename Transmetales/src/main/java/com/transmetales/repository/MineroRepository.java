package com.transmetales.repository;

import com.transmetales.model.Minero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MineroRepository extends JpaRepository<Minero, Integer> {
    
}
