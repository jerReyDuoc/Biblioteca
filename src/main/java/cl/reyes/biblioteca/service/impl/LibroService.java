package cl.reyes.biblioteca.service.impl;

import java.util.ArrayList;
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

    @Override
    public List<Libro> getByAutor(Integer id) {
        List<Libro> lLibro = new ArrayList<>();
        
        for (Libro libro : libroRepository.findAll()) {
            if (libro.getAutor().getIdAutor() == id) {
                Libro aux = libro;
                lLibro.add(aux);
            }
        }

        return lLibro;
    }

    @Override
    public List<Libro> getByEditorial(Integer id) {
        List<Libro> lLibro = new ArrayList<>();
        
        for (Libro libro : libroRepository.findAll()) {
            if (libro.getEditorial().getIdEditorial() == id) {
                Libro aux = libro;
                lLibro.add(aux);
            }
        }

        return lLibro;
    }

    @Override
    public List<Libro> getByGenero(Integer id) {
        List<Libro> lLibro = new ArrayList<>();
        
        for (Libro libro : libroRepository.findAll()) {
            if (libro.getGenero().getIdGenero() == id) {
                Libro aux = libro;
                lLibro.add(aux);
            }
        }

        return lLibro;
    }


}
