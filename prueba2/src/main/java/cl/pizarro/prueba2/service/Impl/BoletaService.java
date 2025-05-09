package cl.pizarro.prueba2.service.Impl;

import org.springframework.stereotype.Service;
import cl.pizarro.prueba2.dto.BoletaDTO.BoletaDTO;


@Service
public class BoletaService implements IBoletaService {

    public interface IBoletaService {
    BoletaDTO generarBoleta(String nombreLibro, double precio, String nombreUsuario);
}

    @Override
    public BoletaDTO generarBoleta(String nombreLibro, double precio, String nombreUsuario) {
        return new BoletaDTO(nombreLibro, precio, nombreUsuario);
    }
}
