package com.clinicaveterinaria.demo.repository;

import com.clinicaveterinaria.demo.model.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IMascotaRepository extends JpaRepository<Mascota, Long> {
    // Buscar coincidencias en especie y raza
    List<Mascota> findByEspecieContainingAndRazaContaining(String especie, String raza);
}
