package cl.reyes.biblioteca.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.reyes.biblioteca.model.Genero;
import cl.reyes.biblioteca.repository.IGeneroRepository;
import cl.reyes.biblioteca.service.IGeneroService;

@Service
public class GeneroService implements IGeneroService{

    @Autowired
    IGeneroRepository generoRepository;

    @Override
    public List<Genero> getAll() {
        return (List<Genero>) generoRepository.findAll();
    }

    @Override
    public Genero getById(Integer id) {
        return generoRepository.findById(id).get();
    }

    @Override
    public Genero insert(Genero genero) {
        return generoRepository.save(genero);
    }

    @Override
    public Genero update(Integer id, Genero genero) {
        return generoRepository.save(genero);
    }

    @Override
    public Genero delete(Integer id){
        generoRepository.deleteById(id);
        return null;
    }

}
