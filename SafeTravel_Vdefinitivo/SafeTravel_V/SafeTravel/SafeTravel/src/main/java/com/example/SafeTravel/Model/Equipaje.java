package com.example.SafeTravel.Model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Equipaje {

    @NotBlank (message = "La id es obligatoria")
    private int id;

    @NotBlank (message = "El rut es obligatorio")
    private String rutPasajero;

    @NotNull (message = "El peso del equipaje es obligatorio")
    private int peso;
    
}
