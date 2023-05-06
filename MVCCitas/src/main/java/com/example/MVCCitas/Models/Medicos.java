package com.example.MVCCitas.Models;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "Medicos")
public class Medicos extends Usuarios {
    private String numColegiado;

    @OneToMany(mappedBy = "medico", cascade = CascadeType.ALL)
    private ArrayList<Cita> citas = new ArrayList<>();

    // Constructor, getters y setters
}
