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

import cl.reyes.biblioteca.model.Autor;
import cl.reyes.biblioteca.service.IAutorService;

@RestController
@RequestMapping("/api/crud/autor")
public class AutorController {

    @Autowired
    IAutorService autorService;

     @GetMapping
    public List<Autor> getAll(){
        return autorService.getAll();
    }

    @GetMapping("/{id}")
    public Autor getById (@PathVariable Integer id) {
        return autorService.getById(id);
    }

    @PostMapping
    public Autor insert (@RequestBody Autor autor) {
        return autorService.insert(autor);
    }

    @PutMapping("/{id}")
    public Autor update (@PathVariable Integer id, @RequestBody Autor autor) {
        return autorService.update(id, autor);
    }

    @DeleteMapping("/{id}")
    public Autor delete (@PathVariable Integer id) {
        return autorService.delete(id);
    }
}
