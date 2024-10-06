package com.clinicaveterinaria.demo.controller;

import com.clinicaveterinaria.demo.model.Duenio;
import com.clinicaveterinaria.demo.service.IDuenioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DuenioController {

    @Autowired
    private IDuenioService duenioServ;

    @PostMapping("/duenio")
    public String crearDuenio(@RequestBody Duenio duenio){
        duenioServ.crearDuenio(duenio);
        return "Dueño creado con éxito";
    }

    @DeleteMapping("/duenio/{idDuenio}")
    public String borrarDuenio(@PathVariable Long idDuenio){
        duenioServ.borrarDuenio(idDuenio);
        return "Dueño borrado con éxito";
    }

    @PutMapping("/duenio")
    public String editarDuenio(@RequestBody Duenio duenio){
        duenioServ.editarDuenio(duenio);
        return "Dueño editado con éxito";
    }

    @GetMapping("/duenio")
    public List<Duenio> obtenerDuenios(){
        return duenioServ.obtenerDuenios();
    }
}
