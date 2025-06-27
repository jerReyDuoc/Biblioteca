package cl.reyes.biblioteca.service;

import java.util.List;

import cl.reyes.biblioteca.model.Genero;

public interface IGeneroService {

    List<Genero> getAll();

    Genero getById(Integer id);

    Genero insert(Genero genero);

    Genero update(Integer id, Genero genero);

    Genero delete(Integer id);

}
