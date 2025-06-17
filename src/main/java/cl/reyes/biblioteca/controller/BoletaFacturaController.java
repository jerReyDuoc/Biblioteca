package cl.reyes.biblioteca.controller;

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

import cl.reyes.biblioteca.model.BoletaFactura;
import cl.reyes.biblioteca.service.IBoletaFacturaService;



@RestController
@RequestMapping("/api/crud/boletaFactura")
public class BoletaFacturaController {
    
    @Autowired
    IBoletaFacturaService boletaFacturaService;

    @GetMapping
    public List<BoletaFactura> getAll(){
        return boletaFacturaService.getAll();
    }

    @GetMapping("/{id}")
    public BoletaFactura getById (@PathVariable Integer id) {
        return boletaFacturaService.getById(id);
    }

    @PostMapping
    public BoletaFactura insert (@RequestBody BoletaFactura boletaFactura) {
        return boletaFacturaService.insert(boletaFactura);
    }

    @PutMapping("/{id}")
    public BoletaFactura update (@PathVariable Integer id, @RequestBody BoletaFactura boletaFactura) {
        return boletaFacturaService.update(id, boletaFactura);
    }

    @DeleteMapping("/{id}")
    public BoletaFactura delete (@PathVariable Integer id) {
        return boletaFacturaService.delete(id);
    }
}