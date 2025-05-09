package cl.pizarro.prueba2.service.Impl;

import cl.pizarro.prueba2.dto.BoletaDTO.BoletaDTO;

public interface IBoletaService {
    BoletaDTO generarBoleta(String nombreLibro, double precio, String nombreUsuario);
}
