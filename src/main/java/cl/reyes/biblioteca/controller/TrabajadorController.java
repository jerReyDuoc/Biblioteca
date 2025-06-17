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

import cl.reyes.biblioteca.model.Trabajador;
import cl.reyes.biblioteca.service.ITrabajadorService;


@RestController
@RequestMapping("/api/crud/trabajador")
public class TrabajadorController {

    @Autowired
    ITrabajadorService trabajadorService;

    @GetMapping
    public List<Trabajador> getAll(){
        return trabajadorService.getAll();
    }

    @GetMapping("/{id}")
    public Trabajador getById (@PathVariable Integer id) {
        return trabajadorService.getById(id);
    }

    @PostMapping
    public Trabajador insert (@RequestBody Trabajador trabajador) {
        return trabajadorService.insert(trabajador);
    }

    @PutMapping("/{id}")
    public Trabajador update (@PathVariable Integer id, @RequestBody Trabajador trabajador) {
        return trabajadorService.update(id, trabajador);
    }

    @DeleteMapping("/{id}")
    public Trabajador delete (@PathVariable Integer id) {
        return trabajadorService.delete(id);
    }
}
