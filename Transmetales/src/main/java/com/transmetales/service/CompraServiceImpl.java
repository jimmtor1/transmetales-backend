package com.transmetales.service;

import com.transmetales.model.Barra;
import com.transmetales.model.Compra;
import com.transmetales.repository.BarraRepository;
import com.transmetales.repository.CompraRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompraServiceImpl implements CompraService {

    @Autowired
    private CompraRepository compraRepository;
    
    @Autowired
    private BarraRepository barraRepository;
    
    @Override
    public Compra create(Compra compra) {
        return this.compraRepository.save(compra);
    }

    @Override
    public Optional getOne(Integer idcompra) {
        return this.compraRepository.findById(idcompra);
    }

    @Override
    public Iterable<Compra> getUnmelted() {
        return this.compraRepository.findByIdbarraIsNull();
    }

    @Override
    public Iterable<Compra> saveAll(Iterable<Compra> compras) {
        return this.compraRepository.saveAll(compras);
    }

    @Override
    public Iterable<Barra> getNoTransferred() {
        return this.barraRepository.findByIdtrasladoIsNull();
    }
}
