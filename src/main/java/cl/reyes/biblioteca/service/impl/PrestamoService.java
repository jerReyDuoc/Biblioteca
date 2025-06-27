package cl.reyes.biblioteca.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cl.reyes.biblioteca.model.Prestamo;
import cl.reyes.biblioteca.repository.IPrestamoRepository;
import cl.reyes.biblioteca.service.IPrestamoService;

public class PrestamoService implements IPrestamoService{

    @Autowired
    IPrestamoRepository prestamoRepository;

    @Override
    public List<Prestamo> getAll() {
        return (List<Prestamo>) prestamoRepository.findAll();
    }

    @Override
    public Prestamo getById(Integer id) {
        return prestamoRepository.findById(id).get();
    }

    @Override
    public Prestamo insert(Prestamo libro) {
        return prestamoRepository.save(libro);
    }

    @Override
    public Prestamo update(Integer id, Prestamo libro) {
        return prestamoRepository.save(libro);
    }

    @Override
    public Prestamo delete(Integer id) {
        prestamoRepository.deleteById(id);
        return null;
    }
}
