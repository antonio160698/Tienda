package com.electronicxs.demo.Models;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="reserva")
public class Reservas {
    @Id
    private Long idRes;
    private Date fechaIngresoRes;
    private Date fechaSalidaRes;
    private int cantidadPersonasRes;
    private String descripcionRes;
    @ManyToOne
    @JoinColumn(name="idCli")
    private Cliente cliente;

    public Reservas(){

    }
}
