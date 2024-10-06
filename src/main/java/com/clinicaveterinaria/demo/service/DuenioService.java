package com.clinicaveterinaria.demo.service;

import com.clinicaveterinaria.demo.model.Duenio;
import com.clinicaveterinaria.demo.repository.IDuenioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DuenioService implements IDuenioService{

    @Autowired
    private IDuenioRepository duenioRepo;

    @Override
    public void crearDuenio(Duenio duenio) {
        duenioRepo.save(duenio);
    }

    @Override
    public void borrarDuenio(Long idDuenio) {
        duenioRepo.deleteById(idDuenio);
    }

    @Override
    public void editarDuenio(Duenio duenio) {
        this.crearDuenio(duenio);
    }

    @Override
    public List<Duenio> obtenerDuenios() {
        List<Duenio> duenios = duenioRepo.findAll();
        return duenios;
    }
}
