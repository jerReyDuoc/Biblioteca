package cl.reyes.biblioteca.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.reyes.biblioteca.model.Resena;

@Repository
public interface IResenaRepository extends CrudRepository<Resena, Integer>{

}
