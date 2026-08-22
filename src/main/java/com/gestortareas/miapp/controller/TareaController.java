package com.gestortareas.miapp.controller;

import com.gestortareas.miapp.dto.TareaDTO;
import com.gestortareas.miapp.service.TareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tareas")
public class TareaController {

    @Autowired
    private TareaService tareaService;

    // GET /tareas - Listar todas
    @GetMapping
    public List<TareaDTO> listarTareas() {
        return tareaService.listarTareas();
    }

    // POST /tareas - Crear tarea
    @PostMapping
    public ResponseEntity<TareaDTO> crearTarea(@RequestBody TareaDTO tareaDTO) {
        TareaDTO nuevaTarea = tareaService.crearTarea(tareaDTO);
        return ResponseEntity.ok(nuevaTarea);
    }

    // PUT /tareas/{id} - Actualizar tarea
    @PutMapping("/{id}")
    public ResponseEntity<TareaDTO> actualizarTarea(@PathVariable Long id, @RequestBody TareaDTO tareaDTO) {
        TareaDTO tareaActualizada = tareaService.actualizarTarea(id, tareaDTO);
        return ResponseEntity.ok(tareaActualizada);
    }

    // DELETE /tareas/{id} - Eliminar tarea
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarTarea(@PathVariable Long id) {
        tareaService.eliminarTarea(id);
        return ResponseEntity.noContent().build();
    }
}