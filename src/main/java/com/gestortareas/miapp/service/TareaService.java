package com.gestortareas.miapp.service;

import com.gestortareas.miapp.dto.TareaDTO;
import com.gestortareas.miapp.model.Tarea;
import com.gestortareas.miapp.repository.TareaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TareaService {

    @Autowired
    private TareaRepository tareaRepository;

    // Listar todas las tareas
    public List<TareaDTO> listarTareas() {
        return tareaRepository.findAll()
                .stream()
                .map(tarea -> new TareaDTO(tarea.getTitulo(), tarea.getCompletada()))
                .collect(Collectors.toList());
    }

    // Crear tarea
    public TareaDTO crearTarea(TareaDTO tareaDTO) {
        Tarea tarea = new Tarea(tareaDTO.getTitulo(), tareaDTO.getCompletada());
        Tarea tareaGuardada = tareaRepository.save(tarea);
        return new TareaDTO(tareaGuardada.getTitulo(), tareaGuardada.getCompletada());
    }

    // Actualizar tarea
    public TareaDTO actualizarTarea(Long id, TareaDTO tareaDTO) {
        Tarea tarea = tareaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Tarea no encontrada"));

        tarea.setTitulo(tareaDTO.getTitulo());
        tarea.setCompletada(tareaDTO.getCompletada());

        Tarea tareaActualizada = tareaRepository.save(tarea);
        return new TareaDTO(tareaActualizada.getTitulo(), tareaActualizada.getCompletada());
    }

    // Eliminar tarea
    public void eliminarTarea(Long id) {
        tareaRepository.deleteById(id);
    }
}