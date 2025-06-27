package cl.reyes.biblioteca.service;

import java.util.List;

import cl.reyes.biblioteca.model.Prestamo;

public interface IPrestamoService {

    List<Prestamo> getAll();

    Prestamo getById(Integer id);

    Prestamo insert(Prestamo prestamo);

    Prestamo update(Integer id, Prestamo prestamo);

    Prestamo delete(Integer id);

}
