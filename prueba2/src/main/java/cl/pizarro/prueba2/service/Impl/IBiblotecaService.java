package cl.pizarro.prueba2.service.Impl;

import java.util.List;

import cl.pizarro.prueba2.dto.BiblotecaDTO.BiblotecaDTO;

public interface IBiblotecaService {

    BiblotecaDTO insertarBibloteca(BiblotecaDTO cBibloteca);

    List<BiblotecaDTO> getAll();

    BiblotecaDTO getById(Long id);

    Boolean deleteById(Long id);

    BiblotecaDTO updateBibloteca(BiblotecaDTO Bibloteca);

}