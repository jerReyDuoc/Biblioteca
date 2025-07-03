package cl.reyes.biblioteca.service;

import java.util.List;

import cl.reyes.biblioteca.model.Libro;

public interface ILibroService {

    List<Libro> getAll();

    Libro getById(Integer id);

    Libro insert(Libro libro);

    Libro update(Integer id, Libro libro);

    Libro delete(Integer id);

    List<Libro> getByAutor(Integer id);

    List<Libro> getByEditorial(Integer id);

    List<Libro> getByGenero(Integer id);

}
