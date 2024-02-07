package com.transmetales.service;

import com.transmetales.model.Barra;
import com.transmetales.model.Compra;
import java.util.Optional;


public interface CompraService {
    
    Compra create(Compra compra);
    Optional<Compra> getOne(Integer idcompra);
    Iterable<Compra> getUnmelted(); 
    Iterable<Compra> saveAll(Iterable<Compra> compras);
    Iterable<Barra> getNoTransferred(); 
    
}
