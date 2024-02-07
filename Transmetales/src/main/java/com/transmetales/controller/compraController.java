package com.transmetales.controller;

import com.transmetales.model.Barra;
import com.transmetales.model.Compra;
import com.transmetales.model.Traslado;
import com.transmetales.repository.BarraRepository;
import com.transmetales.repository.TrasladoRepository;
import com.transmetales.service.CompraService;
import jakarta.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/compra")
@CrossOrigin("*")
public class compraController {

    @Autowired
    private CompraService compraService;

    @Autowired
    private BarraRepository barraRespository;

    @Autowired
    private TrasladoRepository trasladoRespository;

    @GetMapping("unmelted")
    public Iterable<Compra> comprasNoFundidas() {
        return this.compraService.getUnmelted();
    }

    @GetMapping("{id}")
    public Compra obtenerCompra(@PathVariable Integer id) {

        Optional<Compra> c = this.compraService.getOne(id);

        if (c.isPresent()) {

            System.out.println("Compra obtenida:");
            System.out.println(c.get());

            return c.get();
        } else {
            return null;
        }

    }

    @PostMapping("new")
    public Compra generarCompra(@RequestBody Compra compra) {

        Compra c = this.compraService.create(compra);

        System.out.println("Compra generada:");
        System.out.println(c);

        return c;
    }
    
    @GetMapping("notransferred")
    public Iterable<Barra> comprasNoTrasladadas() {
        return this.compraService.getNoTransferred();
    }

    @PostMapping("fundir")
    @Transactional
    public Barra fundirCompras(@RequestBody FundirRequest fundirRequest) {

        Barra b = this.barraRespository.save(fundirRequest.barra);

        System.out.println("Barra Creada:");
        System.out.println(b);

        if (b.getId() != null) {

            List<Compra> compras = new ArrayList<>();
            Compra compra;
            for (Integer i : fundirRequest.ids) {
                compra = this.compraService.getOne(i).get();
                compra.setIdbarra(b.getId());
                compras.add(compra);
            }

            this.compraService.saveAll(compras);

            System.out.println("Compras editadas:");
            System.out.println(compras.size());

            return b;
        } else {
            return null;
        }
    }

    @PostMapping("trasladar")
    @Transactional
    public Traslado trasladarBarras(@RequestBody TrasladoRequest trasladoRequest) {
        System.out.println("hieeeeeeee");
        System.out.println(trasladoRequest);
        
        Traslado t = this.trasladoRespository.save(trasladoRequest.traslado);

        System.out.println("Traslado Creado:");
        System.out.println(t);

        if (t.getId() != null) {

            List<Barra> barras = new ArrayList<>();
            Barra barra;
            for (Integer i : trasladoRequest.ids) {
                barra = this.barraRespository.findById(i).get();
                barra.setIdtraslado(t.getId());
                barras.add(barra);
            }

            this.barraRespository.saveAll(barras);

            System.out.println("Barras editadas:");
            System.out.println(barras.size());

            return t;

        } else {
            return null;
        }

    }

    private record FundirRequest(Barra barra, List<Integer> ids) {}

    private record TrasladoRequest(Traslado traslado, List<Integer> ids) {}

}
