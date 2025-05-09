package cl.pizarro.prueba2.controller.Bibloteca;

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

import cl.pizarro.prueba2.dto.BiblotecaDTO.BiblotecaDTO;
import cl.pizarro.prueba2.service.Impl.IBiblotecaService;

@RestController
@RequestMapping("/api/crud/Bibloteca")
public class BiblotecaController {
    @Autowired
    IBiblotecaService servicio;

    @PostMapping
    public BiblotecaDTO inBiblotecaDTO(@RequestBody BiblotecaDTO Bibloteca){
       
        return servicio.insertarBibloteca(Bibloteca);
    }
    @GetMapping
    public List<BiblotecaDTO> getAll(){
        return servicio.getAll();

    }
    @GetMapping("/{id}")
    public BiblotecaDTO getById(@PathVariable long id){
        return servicio.getById(id);
    }
    @DeleteMapping("/{id}")
    public Boolean deleteById(@PathVariable long id){
        return servicio.deleteById(id);
    }
    @PutMapping("/{id}")
    public BiblotecaDTO inserrBiblotecaDTO(@PathVariable Integer id, @RequestBody BiblotecaDTO Bibloteca){
        return servicio.updateBibloteca(Bibloteca);
    }
}
