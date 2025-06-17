package cl.reyes.biblioteca.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.reyes.biblioteca.model.Libro;
import cl.reyes.biblioteca.repository.ILibroRepository;
import cl.reyes.biblioteca.service.ILibroService;

@Service
public class LibroService implements ILibroService {

    @Autowired
    ILibroRepository libroRepository;

    @Override
    public List<Libro> getAll() {
        return (List<Libro>) libroRepository.findAll();
    }

    @Override
    public Libro getById(Integer id) {
        return libroRepository.findById(id).get();
    }

    @Override
    public Libro insert(Libro libro) {
        return libroRepository.save(libro);
    }

    @Override
    public Libro update(Integer id, Libro libro) {
        return libroRepository.save(libro);
    }

    @Override
    public Libro delete(Integer id) {
        libroRepository.deleteById(id);
        return null;
    }

}
