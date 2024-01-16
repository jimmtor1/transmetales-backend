package com.transmetales.controller;

import com.transmetales.model.Barra;
import com.transmetales.model.Compra;
import com.transmetales.model.Traslado;
import com.transmetales.repository.BarraRepository;
import com.transmetales.repository.CompraRepository;
import com.transmetales.repository.TrasladoRepository;
import jakarta.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/compra")
public class compraController {

    @Autowired
    private CompraRepository compraRespository;

    @Autowired
    private BarraRepository barraRespository;
    
    @Autowired
    private TrasladoRepository trasladoRespository;

    @PostMapping("new")
    public Compra generarCompra(Compra compra) {

        Compra c = this.compraRespository.save(compra);

        System.out.println("Compra generada:");
        System.out.println(c);

        return c;
    }

    @PostMapping("fundir")
    @Transactional
    public Barra fundirCompras(Barra barra, List<Integer> listaIdCompras) {

        Barra b = this.barraRespository.save(barra);
        
        System.out.println("Barra Creada:");
        System.out.println(b);

        if (b.getId() != null) {

            List<Compra> compras = new ArrayList<>();
            Compra compra;
            for (Integer i : listaIdCompras) {

                compra = this.compraRespository.findById(i).get();
                compras.add(compra);

            }
            System.out.println("Compras editadas:");
            for (Compra c : compras) {
                this.compraRespository.save(c);
                System.out.println(c);
            }
            return barra;
        } else {
            return null;
        }
    }

    @PostMapping("trasladar")
    private Traslado trasladarBarras(Traslado traslado){
                
        Traslado t = this.trasladoRespository.save(traslado);
        
        System.out.println("Traslado creado:");
        System.out.println(t);
        
        return traslado;
        
    }

}
