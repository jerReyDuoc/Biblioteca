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

import cl.reyes.biblioteca.model.Prestamo;
import cl.reyes.biblioteca.service.IPrestamoService;

@RestController
@RequestMapping("/api/crud/prestamo")
public class PrestamoController {

    @Autowired
    IPrestamoService prestamoService;

    @GetMapping
    public List<Prestamo> getAll(){
        return prestamoService.getAll();
    }

    @GetMapping("/{id}")
    public Prestamo getById (@PathVariable Integer id) {
        return prestamoService.getById(id);
    }

    @PostMapping
    public Prestamo insert (@RequestBody Prestamo prestamo) {
        return prestamoService.insert(prestamo);
    }

    @PutMapping("/{id}")
    public Prestamo update (@PathVariable Integer id, @RequestBody Prestamo prestamo) {
        return prestamoService.update(id, prestamo);
    }

    @DeleteMapping("/{id}")
    public Prestamo delete (@PathVariable Integer id) {
        return prestamoService.delete(id);
    }
}
