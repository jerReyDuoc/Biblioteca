package cl.reyes.biblioteca.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.reyes.biblioteca.model.Editorial;

@Repository
public interface IEditorialRepository extends CrudRepository <Editorial,Integer>{

}
