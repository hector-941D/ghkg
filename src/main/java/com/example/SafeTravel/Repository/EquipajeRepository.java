package com.example.SafeTravel.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.SafeTravel.Model.Equipaje;

@Repository
public class EquipajeRepository {

    public List<Equipaje> listaEquipaje = new ArrayList<>();
    //Mostrar
    public List<Equipaje> mostrarEquipaje(){
        return listaEquipaje;
    }

    //Registrar
    public Equipaje agregarEquipaje(Equipaje equip){
        listaEquipaje.add(equip);
        int pesoTotal = 0;
        for (Equipaje equipaje : listaEquipaje) {
            pesoTotal += equipaje.getPeso();
        }
        if (pesoTotal > 500){
            listaEquipaje.remove(equip);
            return null;
        }
        return equip;
    }

    //Actualizar
    public Equipaje actualizarEquipaje(Equipaje equip){
        for (Equipaje equipaje : listaEquipaje) {
            if(equipaje.getId() == equip.getId()){
                equipaje.setPeso(equip.getPeso());
                return equipaje;
            }
        }
        return null;
    }

    //Eliminar
    public String eliminarPorId(int id){
        for (Equipaje equipaje : listaEquipaje) {
            if (equipaje.getId() == id){
                listaEquipaje.remove(equipaje);
                return "Se ha eliminado el equipaje";
            }
        }
        return null;
    }

    //Buscar por id
    public Equipaje buscarPorId(int id){
        for (Equipaje equipaje : listaEquipaje) {
            if (equipaje.getId() == id){
                return equipaje;
            }
        }
        return null;
    }
}
