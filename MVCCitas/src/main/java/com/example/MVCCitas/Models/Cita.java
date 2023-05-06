package com.example.MVCCitas.Models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Citas")
public class Cita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date fecha;
    private String observaciones;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuariopaciente")
    private Pacientes paciente;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuariomedico")
    private Medicos medico;

    @OneToOne(mappedBy = "cita", cascade = CascadeType.ALL)
    private Diagnostico diagnostico;

    // Constructor, getters y setters
}
