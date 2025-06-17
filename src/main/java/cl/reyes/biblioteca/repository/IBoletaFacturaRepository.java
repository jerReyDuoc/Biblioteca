package cl.reyes.biblioteca.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.reyes.biblioteca.model.BoletaFactura;

@Repository
public interface IBoletaFacturaRepository extends CrudRepository<BoletaFactura, Integer> {

}
