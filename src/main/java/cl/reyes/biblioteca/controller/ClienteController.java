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

import cl.reyes.biblioteca.model.Cliente;
import cl.reyes.biblioteca.service.IClienteService;

@RestController
@RequestMapping("/api/crud/cliente")
public class ClienteController {

    @Autowired
    IClienteService clienteService;

    @GetMapping
    public List<Cliente> getAll(){
        return clienteService.getAll();
    }

    @GetMapping("/{id}")
    public Cliente getById (@PathVariable Integer id) {
        return clienteService.getById(id);
    }

    @PostMapping
    public Cliente insert (@RequestBody Cliente cliente) {
        return clienteService.insert(cliente);
    }

    @PutMapping("/{id}")
    public Cliente update (@PathVariable Integer id, @RequestBody Cliente cliente) {
        return clienteService.update(id, cliente);
    }

    @DeleteMapping("/{id}")
    public Cliente delete (@PathVariable Integer id) {
        return clienteService.delete(id);
    }
}
