package com.example.SafeTravel.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SafeTravel.Model.Equipaje;
import com.example.SafeTravel.Service.EquipajeService;


@RestController
@RequestMapping("/api/v1/Equipaje")
public class EquipajeController {
    @Autowired
    private EquipajeService equipajeService;

    @GetMapping
    public List<Equipaje> mostrarEquipaje(){
        return equipajeService.getEquipajes();
    }

    @PostMapping
    public Equipaje agregarEquipaje(@RequestBody Equipaje equip){
        return equipajeService.addEquipaje(equip);
    }

    @DeleteMapping("{id}")
    public String borrarEquipaje(@PathVariable int id){
        return equipajeService.deleteEquipaje(id);
    }

    @PutMapping("{id}")
    public Equipaje actualizarEquipaje(@RequestBody Equipaje equip){
        return equipajeService.updatEquipaje(equip);
    }

    @GetMapping("{id}")
    public Equipaje buscarEquipaje(@PathVariable int id) {
        return equipajeService.searchEquipaje(id);
    }
    
}
