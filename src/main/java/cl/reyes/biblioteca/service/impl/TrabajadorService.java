package cl.reyes.biblioteca.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.reyes.biblioteca.model.Trabajador;
import cl.reyes.biblioteca.repository.ITrabajadorRepository;
import cl.reyes.biblioteca.service.ITrabajadorService;


@Service
public class TrabajadorService implements ITrabajadorService {

    @Autowired
    ITrabajadorRepository trabajadorRepository;

    @Override
    public List<Trabajador> getAll() {
        return (List<Trabajador>) trabajadorRepository.findAll();
    }

    @Override
    public Trabajador getById(Integer id) {
        return trabajadorRepository.findById(id).get();
    }

    @Override
    public Trabajador insert(Trabajador trabajador) {
        return trabajadorRepository.save(trabajador);
    }

    @Override
    public Trabajador update(Integer id, Trabajador trabajador) {
        return trabajadorRepository.save(trabajador);
    }

    @Override
    public Trabajador delete(Integer id) {
        trabajadorRepository.deleteById(id);
        return null;
    }

}