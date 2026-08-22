package com.gestortareas.miapp.repository;

import com.gestortareas.miapp.model.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TareaRepository extends JpaRepository<Tarea, Long> {
    // Spring Data JPA ya tiene métodos como:
    // findAll(), findById(), save(), deleteById()
}