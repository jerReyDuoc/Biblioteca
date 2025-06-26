package cl.reyes.biblioteca.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.reyes.biblioteca.model.Autor;

@Repository
public interface IAutorRepository extends CrudRepository <Autor,Integer>{

}
