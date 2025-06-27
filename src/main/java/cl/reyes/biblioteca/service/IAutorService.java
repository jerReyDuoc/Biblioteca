package cl.reyes.biblioteca.service;

import java.util.List;

import cl.reyes.biblioteca.model.Autor;

public interface IAutorService {

    List<Autor> getAll();

    Autor getById(Integer id);

    Autor insert(Autor autor);

    Autor update(Integer id, Autor autor);

    Autor delete(Integer id);


     }