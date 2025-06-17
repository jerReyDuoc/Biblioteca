package cl.reyes.biblioteca.service;

import java.util.List;

import cl.reyes.biblioteca.model.BoletaFactura;


public interface IBoletaFacturaService {

    List<BoletaFactura> getAll();

    BoletaFactura getById(Integer id);

    BoletaFactura insert(BoletaFactura boletaFactura);

    BoletaFactura update(Integer id, BoletaFactura boletaFactura);

    BoletaFactura delete(Integer id);
}
