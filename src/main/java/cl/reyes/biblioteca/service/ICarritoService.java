package cl.reyes.biblioteca.service;

import java.util.List;

import cl.reyes.biblioteca.model.Carrito;



public interface ICarritoService {

    List<Carrito> getAll();

    Carrito getById(Integer id);

    Carrito insert(Carrito carrito);

    Carrito update(Integer id, Carrito carrito);

    Carrito delete(Integer id);

}
