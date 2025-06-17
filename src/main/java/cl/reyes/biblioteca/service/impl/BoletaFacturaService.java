package cl.reyes.biblioteca.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.reyes.biblioteca.model.BoletaFactura;
import cl.reyes.biblioteca.repository.IBoletaFacturaRepository;
import cl.reyes.biblioteca.service.IBoletaFacturaService;


@Service
public class BoletaFacturaService implements IBoletaFacturaService {

    @Autowired
    IBoletaFacturaRepository boletaFacturaRepository;

    @Override
    public List<BoletaFactura> getAll() {
        return (List<BoletaFactura>) boletaFacturaRepository.findAll();
    }

    @Override
    public BoletaFactura getById(Integer id) {
        return boletaFacturaRepository.findById(id).get();
    }

    @Override
    public BoletaFactura insert(BoletaFactura boletaFactura) {
        return boletaFacturaRepository.save(boletaFactura);
    }

    @Override
    public BoletaFactura update(Integer id, BoletaFactura boletaFactura) {
        return boletaFacturaRepository.save(boletaFactura);
    }

    @Override
    public BoletaFactura delete(Integer id) {
        boletaFacturaRepository.deleteById(id);
        return null;
    }

}
