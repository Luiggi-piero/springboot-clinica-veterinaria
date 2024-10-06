package com.clinicaveterinaria.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Mascota {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String nombre;
    private String especie;
    private String raza;
    private String color;

    @OneToOne
    @JoinColumn(name = "unduenio_id_duenio", referencedColumnName = "id")
    private Duenio unDuenio;

    public Mascota() {
    }

    public Mascota(Long id, String nombre, String especie, String raza, String color, Duenio unDuenio) {
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.color = color;
        this.unDuenio = unDuenio;
    }
}
