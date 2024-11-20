package com.example.tarea.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "ProductosODA")
public class ProductosODA {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productoId;

    private String nombre;

    private String descripcion;
}
