package com.example.SafeTravel.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SafeTravel.Model.Equipaje;
import com.example.SafeTravel.Repository.EquipajeRepository;

@Service

public class EquipajeService {
    @Autowired
    private EquipajeRepository equipajeRepository;

    public List<Equipaje> getEquipajes(){
        return equipajeRepository.mostrarEquipaje();
    }

    public Equipaje addEquipaje(Equipaje equip){
        return equipajeRepository.agregarEquipaje(equip);
    }

    public Equipaje updatEquipaje(Equipaje equip){
        return equipajeRepository.actualizarEquipaje(equip);
    }

    public String deleteEquipaje (int id){
        return equipajeRepository.eliminarPorId(id);
    }

    public Equipaje searchEquipaje (int id){
        return equipajeRepository.buscarPorId(id);
    }
}
