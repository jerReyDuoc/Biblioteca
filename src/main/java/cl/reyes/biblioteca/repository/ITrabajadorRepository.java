package cl.reyes.biblioteca.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.reyes.biblioteca.model.Trabajador;


@Repository
public interface ITrabajadorRepository extends CrudRepository<Trabajador, Integer>{

}
