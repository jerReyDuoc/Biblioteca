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

import cl.reyes.biblioteca.model.Carrito;
import cl.reyes.biblioteca.service.ICarritoService;


@RestController
@RequestMapping("/api/crud/carrito")
public class CarritoController {

    @Autowired
    ICarritoService carritoService;

    @GetMapping
    public List<Carrito> getAll(){
        return carritoService.getAll();
    }

    @GetMapping("/{id}")
    public Carrito getById (@PathVariable Integer id) {
        return carritoService.getById(id);
    }

    @PostMapping
    public Carrito insert (@RequestBody Carrito carrito) {
        return carritoService.insert(carrito);
    }

    @PutMapping("/{id}")
    public Carrito update (@PathVariable Integer id, @RequestBody Carrito carrito) {
        return carritoService.update(id, carrito);
    }

    @DeleteMapping("/{id}")
    public Carrito delete (@PathVariable Integer id) {
        return carritoService.delete(id);
    }

}
