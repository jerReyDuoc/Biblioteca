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

import cl.reyes.biblioteca.model.Genero;
import cl.reyes.biblioteca.service.IGeneroService;

@RestController
@RequestMapping("/api/crud/genero")
public class GeneroController {

    @Autowired
    IGeneroService generoService;

    @GetMapping
    public List<Genero> getAll(){
        return generoService.getAll();
    }

    @GetMapping("/{id}")
    public Genero getById (@PathVariable Integer id) {
        return generoService.getById(id);
    }

    @PostMapping
    public Genero insert (@RequestBody Genero genero) {
        return generoService.insert(genero);
    }

    @PutMapping("/{id}")
    public Genero update (@PathVariable Integer id, @RequestBody Genero genero) {
        return generoService.update(id, genero);
    }

    @DeleteMapping("/{id}")
    public Genero delete (@PathVariable Integer id) {
        return generoService.delete(id);
    }
}
