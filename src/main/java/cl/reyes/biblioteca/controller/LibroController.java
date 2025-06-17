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

import cl.reyes.biblioteca.model.Libro;
import cl.reyes.biblioteca.service.ILibroService;

@RestController
@RequestMapping("/api/crud/libro")
public class LibroController {
    
    @Autowired
    ILibroService libroService;

    @GetMapping
    public List<Libro> getAll(){
        return libroService.getAll();
    }

    @GetMapping("/{id}")
    public Libro getById (@PathVariable Integer id) {
        return libroService.getById(id);
    }

    @PostMapping
    public Libro insert (@RequestBody Libro libro) {
        return libroService.insert(libro);
    }

    @PutMapping("/{id}")
    public Libro update (@PathVariable Integer id, @RequestBody Libro libro) {
        return libroService.update(id, libro);
    }

    @DeleteMapping("/{id}")
    public Libro delete (@PathVariable Integer id) {
        return libroService.delete(id);
    }
}
