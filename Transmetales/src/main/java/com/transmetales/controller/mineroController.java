
package com.transmetales.controller;

import com.transmetales.model.Minero;
import com.transmetales.service.MineroService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/minero")
public class mineroController {
    
    @Autowired
    private MineroService mineroService;
    
    @GetMapping()
    public List<Minero> list() {
        return this.mineroService.getAll();
    }
    
    @GetMapping("{id}")
    public Minero getOne(@PathVariable Integer id){
        return this.mineroService.getOne(id);
    }
    
    @PostMapping
    public Minero save(@RequestBody Minero minero){
        System.out.println(minero);
        return this.mineroService.save(minero);
    }
    
    @PutMapping
    public Minero edit(@RequestBody Minero minero){        
        return this.mineroService.edit(minero);
    }
      
    @DeleteMapping("{id}")
    public boolean delete(@PathVariable Integer id){        
        return !this.mineroService.deleteOne(id);        
    }
    
  
    
    
    
}
