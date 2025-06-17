package cl.reyes.biblioteca.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import cl.reyes.biblioteca.model.Libro;

@Repository
public interface ILibroRepository extends CrudRepository<Libro, Integer> {

}
