package com.transmetales.controller;

import com.transmetales.model.Cliente;
import com.transmetales.model.Venta;
import com.transmetales.repository.ClienteRepository;
import com.transmetales.repository.VentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/venta")
public class ventaController {

    @Autowired
    private ClienteRepository clienteRepository;
   
    @Autowired
    private VentaRepository ventaRepository;    
        
    @PostMapping("nuevocliente")
    public Cliente save(Cliente cliente){       
        
        Cliente c = this.clienteRepository.save(cliente);
        System.out.println("Cliente creado:");
        System.out.println(c);
        return c;
        
    }
    
    @PostMapping()
    public Venta save(Venta venta){       
        
        Venta v = this.ventaRepository.save(venta);
        System.out.println("Venta creada:");
        System.out.println(v);
        return v;
        
    }
    
}
