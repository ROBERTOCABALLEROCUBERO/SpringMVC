package com.example.MVCCitas.Models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Pacientes")
public class Pacientes extends Usuarios {
    private String numSeguridadSocial;
    private String numTarjeta;
    private String telefono;
    private String direccion;

    @OneToMany(mappedBy = "paciente", cascade = CascadeType.ALL)
    private ArrayList<Cita> citas = new ArrayList<>();

    // Constructor, getters y setters
}
