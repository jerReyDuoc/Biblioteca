package cl.reyes.biblioteca.service;

import java.util.List;

import cl.reyes.biblioteca.model.Trabajador;


public interface ITrabajadorService {

    List<Trabajador> getAll();

    Trabajador getById(Integer id);

    Trabajador insert(Trabajador trabajador);

    Trabajador update(Integer id, Trabajador trabajador);

    Trabajador delete(Integer id);

}
