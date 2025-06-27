package cl.reyes.biblioteca.service;

import java.util.List;

import cl.reyes.biblioteca.model.Editorial;

public interface IEditorialService {

    List<Editorial> getAll();

    Editorial getById(Integer id);

    Editorial insert(Editorial editorial);

    Editorial update(Integer id, Editorial editorial);

    Editorial delete(Integer id);

 }
