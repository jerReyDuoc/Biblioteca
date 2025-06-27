package cl.reyes.biblioteca.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import cl.reyes.biblioteca.model.Editorial;
import cl.reyes.biblioteca.repository.IEditorialRepository;
import cl.reyes.biblioteca.service.IEditorialService;

@Service
public class EditorialService implements IEditorialService{

    @Autowired
    IEditorialRepository editorialRepository;

    @Override
    public List<Editorial> getAll() {
        return (List<Editorial>) editorialRepository.findAll();
    }

    @Override
    public Editorial getById(Integer id) {
        return editorialRepository.findById(id).get();
    }

    @Override
    public Editorial insert(Editorial editorial) {
        return editorialRepository.save(editorial);
    }

    @Override
    public Editorial update(Integer id, Editorial editorial) {
        return editorialRepository.save(editorial);
    }

    @Override
    public Editorial delete(Integer id) {
        editorialRepository.deleteById(id);
        return null;
    }
}
