package cl.reyes.biblioteca.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.reyes.biblioteca.model.Autor;
import cl.reyes.biblioteca.repository.IAutorRepository;
import cl.reyes.biblioteca.service.IAutorService;

@Service
public class AutorService implements IAutorService{
    @Autowired
    IAutorRepository autorRepository;

     @Override
    public List<Autor> getAll() {
        return (List<Autor>) autorRepository.findAll();
    }

    @Override
    public Autor getById(Integer id) {
        return autorRepository.findById(id).get();
    }

    @Override
    public Autor insert(Autor autor) {
        return autorRepository.save(autor);
    }

    @Override
    public Autor update(Integer id, Autor autor) {
        return autorRepository.save(autor);
    }

    @Override
    public Autor delete(Integer id) {
        autorRepository.deleteById(id);
        return null;
    }

}
