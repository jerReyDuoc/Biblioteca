package cl.reyes.biblioteca.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.reyes.biblioteca.model.Carrito;


@Repository
public interface ICarritoRepository extends CrudRepository<Carrito, Integer>{

}
