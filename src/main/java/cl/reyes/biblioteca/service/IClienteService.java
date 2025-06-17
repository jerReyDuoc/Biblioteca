package cl.reyes.biblioteca.service;

import java.util.List;

import cl.reyes.biblioteca.model.Cliente;

public interface IClienteService {

    List<Cliente> getAll();

    Cliente getById(Integer id);

    Cliente insert(Cliente cliente);

    Cliente update(Integer id, Cliente cliente);

    Cliente delete(Integer id);

}
