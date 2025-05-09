package cl.pizarro.prueba2.controller.Cliente;

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

import cl.pizarro.prueba2.dto.ClienteDTO.ClienteDTO;
import cl.pizarro.prueba2.service.Impl.IClienteService;

@RestController
@RequestMapping("api/crud/cliente")


public class ClienteController {

     @Autowired
    IClienteService servicio;

    @PostMapping
    public ClienteDTO ClienteDTO(@RequestBody ClienteDTO Cliente){
       
        return servicio.insertarCliente(Cliente);
    }
    @GetMapping
    public List<ClienteDTO> getAll(){
        return servicio.getAll();

    }
    @GetMapping("/{id}")
    public ClienteDTO getById(@PathVariable long id){
        return servicio.getById(id);
    }
    @DeleteMapping("/{id}")
    public Boolean deleteById(@PathVariable long id){
        return servicio.deleteById(id);
    }
    @PutMapping("/{id}")
    public ClienteDTO insertClienteDTO(@PathVariable Integer id, @RequestBody ClienteDTO Cliente){
        return servicio.updateCliente(Cliente);
    }

}
