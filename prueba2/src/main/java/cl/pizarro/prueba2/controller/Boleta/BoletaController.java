package cl.pizarro.prueba2.controller.Boleta;

import cl.pizarro.prueba2.dto.BoletaDTO.BoletaDTO;
import cl.pizarro.prueba2.service.Impl.IBoletaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/boleta")
public class BoletaController {

    @Autowired
    private IBoletaService boletaService;

    @PostMapping("/generar")
    public BoletaDTO generarBoleta(@RequestParam String nombreLibro,
                                    @RequestParam double precio,
                                    @RequestParam String nombreUsuario) {
        return boletaService.generarBoleta(nombreLibro, precio, nombreUsuario);
    }
}
