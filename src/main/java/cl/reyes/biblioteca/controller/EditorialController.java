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

import cl.reyes.biblioteca.model.Editorial;
import cl.reyes.biblioteca.service.IEditorialService;

@RestController
@RequestMapping("/api/crud/editorial")
public class EditorialController {

    @Autowired
    IEditorialService editorialService;

    @GetMapping
    public List<Editorial> getAll(){
        return editorialService.getAll();
    }

    @GetMapping("/{id}")
    public Editorial getById (@PathVariable Integer id) {
        return editorialService.getById(id);
    }

    @PostMapping
    public Editorial insert (@RequestBody Editorial editorial) {
        return editorialService.insert(editorial);
    }

    @PutMapping("/{id}")
    public Editorial update (@PathVariable Integer id, @RequestBody Editorial editorial) {
        return editorialService.update(id, editorial);
    }

    @DeleteMapping("/{id}")
    public Editorial delete (@PathVariable Integer id) {
        return editorialService.delete(id);
    }
}


