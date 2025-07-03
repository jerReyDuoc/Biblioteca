package cl.reyes.biblioteca.service.impl;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.reyes.biblioteca.model.Prestamo;
import cl.reyes.biblioteca.repository.IPrestamoRepository;
import cl.reyes.biblioteca.response.PrestamoResponse;
import cl.reyes.biblioteca.service.IPrestamoService;

@Service
public class PrestamoService implements IPrestamoService{

    @Autowired
    IPrestamoRepository prestamoRepository;

    @Autowired
    ModelMapper modelMap;

    @Override
    public List<Prestamo> getAll() {
        //List<Prestamo> lPres = (List<Prestamo>) prestamoRepository.findAll();
        //List<PrestamoResponse> lPresRes = new ArrayList<>();

        //for (Prestamo prestamo : lPres) {
            //PrestamoResponse aux = modelMap.map(prestamo, PrestamoResponse.class);
            //lPresRes.add(aux);
        //}
        //return lPresRes;
        return (List<Prestamo>) prestamoRepository.findAll();
    }

    @Override
    public Prestamo getById(Integer id) {
        return prestamoRepository.findById(id).get();
    }

    @Override
    public Prestamo insert(Prestamo libro) {
        return prestamoRepository.save(libro);
    }

    @Override
    public Prestamo update(Integer id, Prestamo libro) {
        return prestamoRepository.save(libro);
    }

    @Override
    public Prestamo delete(Integer id) {
        prestamoRepository.deleteById(id);
        return null;
    }

    @Override
    public List<PrestamoResponse> getMorosos() {
        List<Prestamo> lPres = (List<Prestamo>) prestamoRepository.findAll();
        List<PrestamoResponse> lPresRes = new ArrayList<>();
        LocalDate local = LocalDate.now();
        Date today = Date.from(local.atStartOfDay(ZoneId.systemDefault()).toInstant());

        for (Prestamo prestamo : lPres) {
            if (prestamo.getEstado() && today.after(prestamo.getFechaTermino())) {
                PrestamoResponse aux = modelMap.map(prestamo, PrestamoResponse.class);
                lPresRes.add(aux);
            }
        }
        return lPresRes;
    }
}
