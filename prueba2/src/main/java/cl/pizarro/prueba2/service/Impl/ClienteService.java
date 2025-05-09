package cl.pizarro.prueba2.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.pizarro.prueba2.dto.ClienteDTO.ClienteDTO;
import cl.pizarro.prueba2.repository.IClienteRepository;

@Service
public class ClienteService implements IClienteService {
     @Autowired
    public
    IClienteRepository repo;

    @Override
    public ClienteDTO insertarCliente(ClienteDTO Cliente){
        return Cliente.insertCliente(this);
    }

@Override
public List<ClienteDTO> getAll() {
    return (List<ClienteDTO>) repo.findAll();
}
@Override
public ClienteDTO getById(Long id){
    return repo.findById(id.intValue()).get();
}
@Override
public Boolean deleteById(Long id){
    repo.deleteById(id.intValue());
    return true;
 }
@Override
public ClienteDTO updateCliente(ClienteDTO Cliente){
    return repo.save(Cliente);
}

}
