package com.clinicaveterinaria.demo.service;

import com.clinicaveterinaria.demo.dto.MascotaDuenioDTO;
import com.clinicaveterinaria.demo.model.Mascota;

import java.util.List;

public interface IMascotaService {

    public void crearMascota(Mascota mascota);

    public void borrarMascota(Long idMascota);

    public void editarMascota(Mascota mascota);

    public List<Mascota> obtenerMascotas();

    public Mascota buscarMarcota(Long idMascota);

    public List<Mascota> buscarPorEspecieYRaza(String especie, String raza);

    public MascotaDuenioDTO obtenerDatosMascotaDuenio(Long idMascota);
}
