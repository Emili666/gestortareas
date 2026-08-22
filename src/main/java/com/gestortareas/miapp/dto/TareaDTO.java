package com.gestortareas.miapp.dto;


public class TareaDTO {

    private String titulo;
    private Boolean completada;

    // Constructor vacío
    public TareaDTO() {}

    // Constructor con parámetros
    public TareaDTO(String titulo, Boolean completada) {
        this.titulo = titulo;
        this.completada = completada;
    }

    // Getters y Setters
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