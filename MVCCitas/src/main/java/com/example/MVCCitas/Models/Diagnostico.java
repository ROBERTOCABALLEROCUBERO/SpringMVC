package com.example.MVCCitas.Models;

import javax.persistence.GenerationType;
import javax.persistence.*;

@Entity
@Table(name = "Diagnosticos")
public class Diagnostico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String valoracionEspecialista;
    private String enfermedad;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "citaId")
    private Cita cita;

    // Constructor, getters y setters
}
