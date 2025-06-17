package cl.reyes.biblioteca.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.reyes.biblioteca.model.Cliente;
import cl.reyes.biblioteca.repository.IClienteRepository;
import cl.reyes.biblioteca.service.IClienteService;

@Service
public class ClienteService implements IClienteService {

    @Autowired
    IClienteRepository clienteRepository;

    @Override
    public List<Cliente> getAll() {
        return (List<Cliente>) clienteRepository.findAll();
    }

    @Override
    public Cliente getById(Integer id) {
        return clienteRepository.findById(id).get();
    }

    @Override
    public Cliente insert(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public Cliente update(Integer id, Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public Cliente delete(Integer id) {
        clienteRepository.deleteById(id);
        return null;
    }

}
