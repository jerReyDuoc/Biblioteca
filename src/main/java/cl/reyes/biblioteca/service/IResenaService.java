package cl.reyes.biblioteca.service;

import java.util.List;

import cl.reyes.biblioteca.model.Resena;

public interface IResenaService {

    List<Resena> getAll();

    Resena getById(Integer id);

    Resena insert(Resena resena);

    Resena update(Integer id, Resena resena);

    Resena delete(Integer id);

}
