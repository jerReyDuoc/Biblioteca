package cl.reyes.biblioteca.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.reyes.biblioteca.model.Prestamo;
@Repository
public interface IPrestamoRepository extends CrudRepository<Prestamo,Integer>{

}
