package cl.pizarro.prueba2.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.pizarro.prueba2.dto.BiblotecaDTO.BiblotecaDTO;
@Repository
public interface IBiblotecaRepository extends CrudRepository <BiblotecaDTO,Integer> {

}
