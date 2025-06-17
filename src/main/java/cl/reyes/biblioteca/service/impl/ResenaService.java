package cl.reyes.biblioteca.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.reyes.biblioteca.model.Resena;
import cl.reyes.biblioteca.repository.IResenaRepository;
import cl.reyes.biblioteca.service.IResenaService;

@Service
public class ResenaService implements IResenaService {
    
    @Autowired
    IResenaRepository resenaRepository;

    @Override
    public List<Resena> getAll() {
        return (List<Resena>) resenaRepository.findAll();
    }

    @Override
    public Resena getById(Integer id) {
        return resenaRepository.findById(id).get();
    }

    @Override
    public Resena insert(Resena resena) {
        return resenaRepository.save(resena);
    }

    @Override
    public Resena update(Integer id, Resena resena) {
        return resenaRepository.save(resena);
    }

    @Override
    public Resena delete(Integer id) {
        resenaRepository.deleteById(id);
        return null;
    }
}
