package cl.pizarro.prueba2.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.pizarro.prueba2.dto.ClienteDTO.ClienteDTO;
@Repository
public interface IClienteRepository extends CrudRepository <ClienteDTO,Integer> {
}
