package com.gestortareas.miapp.model;

import jakarta.persistence.*;

@Entity
@Table(name = "TAREAS")
public class Tarea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String titulo;

    @Column(nullable = false)
    private Boolean completada = false;

    // Constructor vacío (necesario para JPA)
    public Tarea() {}

    // Constructor con parámetros
    public Tarea(String titulo, Boolean completada) {
        this.titulo = titulo;
        this.completada = completada;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Boolean getCompletada() {
        return completada;
    }

    public void setCompletada(Boolean completada) {
        this.completada = completada;
    }
}