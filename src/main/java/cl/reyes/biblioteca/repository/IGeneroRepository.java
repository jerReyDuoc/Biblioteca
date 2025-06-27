package cl.reyes.biblioteca.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.reyes.biblioteca.model.Genero;

@Repository
public interface IGeneroRepository extends CrudRepository<Genero, Integer>{

}
