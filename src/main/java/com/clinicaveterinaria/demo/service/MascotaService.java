package com.clinicaveterinaria.demo.service;

import com.clinicaveterinaria.demo.dto.MascotaDuenioDTO;
import com.clinicaveterinaria.demo.model.Mascota;
import com.clinicaveterinaria.demo.repository.IMascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MascotaService implements IMascotaService {
    @Autowired
    private IMascotaRepository mascotaRepo;

    @Override
    public void crearMascota(Mascota mascota) {
        mascotaRepo.save(mascota);
    }

    @Override
    public void borrarMascota(Long idMascota) {
        mascotaRepo.deleteById(idMascota);
    }

    @Override
    public void editarMascota(Mascota mascota) {
        this.crearMascota(mascota);
    }

    @Override
    public List<Mascota> obtenerMascotas() {
        return mascotaRepo.findAll();
    }

    @Override
    public Mascota buscarMarcota(Long idMascota) {
        Mascota mas = mascotaRepo.findById(idMascota).orElse(null);
        return mas;
    }

    @Override
    public List<Mascota> buscarPorEspecieYRaza(String especie, String raza) {
        return mascotaRepo.findByEspecieContainingAndRazaContaining(especie, raza);
    }

    @Override
    public MascotaDuenioDTO obtenerDatosMascotaDuenio(Long idMascota) {
        Mascota mascota = mascotaRepo.findById(idMascota).orElse(null);
        MascotaDuenioDTO mascotaDuenioDto = new MascotaDuenioDTO();
        mascotaDuenioDto.setNombreMascota(mascota.getNombre());
        mascotaDuenioDto.setEspecie(mascota.getEspecie());
        mascotaDuenioDto.setRaza(mascota.getRaza());
        mascotaDuenioDto.setNombreDuenio(mascota.getUnDuenio().getNombre());
        mascotaDuenioDto.setApellidoDuenio(mascota.getUnDuenio().getApellido());
        return mascotaDuenioDto;
    }
}
