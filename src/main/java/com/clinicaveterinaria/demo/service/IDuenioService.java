package com.clinicaveterinaria.demo.service;

import com.clinicaveterinaria.demo.model.Duenio;

import java.util.List;

public interface IDuenioService {

    public void crearDuenio(Duenio duenio);

    public void borrarDuenio(Long idDuenio);

    public void editarDuenio(Duenio duenio);

    public List<Duenio> obtenerDuenios();
}
