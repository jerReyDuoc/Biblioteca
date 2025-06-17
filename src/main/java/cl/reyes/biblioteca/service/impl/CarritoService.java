package cl.reyes.biblioteca.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.reyes.biblioteca.model.Carrito;
import cl.reyes.biblioteca.repository.ICarritoRepository;
import cl.reyes.biblioteca.service.ICarritoService;


@Service
public class CarritoService implements ICarritoService {
    
    @Autowired
    ICarritoRepository carritoRepository;

    @Override
    public List<Carrito> getAll() {
        return (List<Carrito>) carritoRepository.findAll();
    }

    @Override
    public Carrito getById(Integer id) {
        return carritoRepository.findById(id).get();
    }

    @Override
    public Carrito insert(Carrito carrito) {
        return carritoRepository.save(carrito);
    }

    @Override
    public Carrito update(Integer id, Carrito carrito) {
        return carritoRepository.save(carrito);
    }

    @Override
    public Carrito delete(Integer id) {
        carritoRepository.deleteById(id);
        return null;
    }

}