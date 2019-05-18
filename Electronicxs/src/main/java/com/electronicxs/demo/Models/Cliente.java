package com.electronicxs.demo.Models;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name="cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCli;
    private String nombreCli;
    private String apellidoCli;
    private String identificacionCli;
    private String direccionCli;
    private String emailCli;
    @OneToMany(mappedBy = "cliente")
    private Set<Reservas> reserva;

    public Cliente(){

    }
}

