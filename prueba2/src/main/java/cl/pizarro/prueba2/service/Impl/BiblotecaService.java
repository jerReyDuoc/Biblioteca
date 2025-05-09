package cl.pizarro.prueba2.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.pizarro.prueba2.dto.BiblotecaDTO.BiblotecaDTO;
import cl.pizarro.prueba2.repository.IBiblotecaRepository;
import cl.pizarro.prueba2.service.Impl.BiblotecaService;

@Service
public class BiblotecaService implements IBiblotecaService{
    @Autowired
    public
    IBiblotecaRepository repo;

    @Override
    public BiblotecaDTO insertarBibloteca(BiblotecaDTO Bibloteca){
        return Bibloteca.insertarBibloteca(this);
    }

@Override
public List<BiblotecaDTO> getAll() {
    return (List<BiblotecaDTO>) repo.findAll();
}
@Override
public BiblotecaDTO getById(Long id){
    return repo.findById(id.intValue()).get();
}
@Override
public Boolean deleteById(Long id){
    repo.deleteById(id.intValue());
    return true;
 }
@Override
public BiblotecaDTO updateBibloteca(BiblotecaDTO Bibloteca){
    return repo.save(Bibloteca);
}

}