package cl.reyes.biblioteca.service;

import java.util.List;

import cl.reyes.biblioteca.model.Prestamo;
//import cl.reyes.biblioteca.response.PrestamoResponse;
import cl.reyes.biblioteca.response.PrestamoResponse;

public interface IPrestamoService {

    List<Prestamo> getAll();

    Prestamo getById(Integer id);

    Prestamo insert(Prestamo prestamo);

    Prestamo update(Integer id, Prestamo prestamo);

    Prestamo delete(Integer id);

    List<PrestamoResponse> getMorosos();

}
