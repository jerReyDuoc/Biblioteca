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

import cl.reyes.biblioteca.model.Resena;
import cl.reyes.biblioteca.service.IResenaService;

@RestController
@RequestMapping("/api/crud/resena")
public class ResenaController {

    @Autowired
    IResenaService resenaService;

    @GetMapping
    public List<Resena> getAll(){
        return resenaService.getAll();
    }

    @GetMapping("/{id}")
    public Resena getById (@PathVariable Integer id) {
        return resenaService.getById(id);
    }

    @PostMapping
    public Resena insert (@RequestBody Resena resena) {
        return resenaService.insert(resena);
    }

    @PutMapping("/{id}")
    public Resena update (@PathVariable Integer id, @RequestBody Resena resena) {
        return resenaService.update(id, resena);
    }

    @DeleteMapping("/{id}")
    public Resena delete (@PathVariable Integer id) {
        return resenaService.delete(id);
    }

}
