package cl.pizarro.prueba2.service.Impl;

import java.util.List;

import cl.pizarro.prueba2.dto.ClienteDTO.ClienteDTO;

public interface IClienteService {
    ClienteDTO insertarCliente(ClienteDTO Cliente);

    List<ClienteDTO> getAll();

    ClienteDTO getById(Long id);

    Boolean deleteById(Long id);

    ClienteDTO updateCliente(ClienteDTO Cliente);

}
