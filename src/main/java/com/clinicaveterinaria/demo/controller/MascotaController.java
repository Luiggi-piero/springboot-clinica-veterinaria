package com.clinicaveterinaria.demo.controller;

import com.clinicaveterinaria.demo.dto.MascotaDuenioDTO;
import com.clinicaveterinaria.demo.model.Mascota;
import com.clinicaveterinaria.demo.service.IMascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MascotaController {
    @Autowired
    private IMascotaService mascotaServe;

    @PostMapping("/mascota")
    public String crearMascota(@RequestBody Mascota mascota){
        mascotaServe.crearMascota(mascota);
        return "Mascota creada con éxito";
    }

    @DeleteMapping("/mascota/{idMascota}")
    public String borrarMascota(@PathVariable Long idMascota){
        mascotaServe.borrarMascota(idMascota);
        return "Mascota borrada con éxito";
    }

    @PutMapping("/mascota")
    public Mascota editarMascota(@RequestBody Mascota mascota){
        mascotaServe.editarMascota(mascota);

        return mascotaServe.buscarMarcota(mascota.getId());
    }

    @GetMapping("/mascota")
    public List<Mascota> obtenerMascotas(){
        return mascotaServe.obtenerMascotas();
    }

    @GetMapping("/mascota/{especie}/{raza}")
    public List<Mascota> obtenerMascotasPorEspecieRaza(@PathVariable String especie, @PathVariable String raza){
        return mascotaServe.buscarPorEspecieYRaza(especie, raza);
    }

    @GetMapping("/mascota/con-duenio/{idMascota}")
    public MascotaDuenioDTO obtenerDatosMascotaDuenio(@PathVariable Long idMascota){
        return mascotaServe.obtenerDatosMascotaDuenio(idMascota);
    }
}
