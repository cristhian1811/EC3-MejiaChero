package com.example.ec3mejiachero.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
public class Salario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private BigDecimal monto;

    @OneToOne
    @JoinColumn(name = "empleado_id")
    private Empleado empleado;
}