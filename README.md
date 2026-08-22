# Gestor de Tareas

Aplicación CRUD de gestión de tareas construida con **Spring Boot**, con un frontend estático simple servido desde el propio backend. Desplegada en DonWeb.

## Funcionalidades

- Listar todas las tareas.
- Crear una tarea nueva (título + estado completada/pendiente).
- Actualizar una tarea existente.
- Eliminar una tarea.
- Interfaz web básica (`index.html`) para interactuar sin necesidad de un cliente API aparte.

## Stack técnico

| Categoría | Tecnología |
|---|---|
| Backend | Java, Spring Boot, Spring Data JPA |
| Frontend | HTML/CSS/JS estático servido por Spring Boot |
| Build | Maven |
| Contenedores | Docker / Docker Compose |
| Deploy | DonWeb |

## Endpoints

| Método | Ruta | Descripción |
|---|---|---|
| GET | `/tareas` | Lista todas las tareas |
| POST | `/tareas` | Crea una tarea |
| PUT | `/tareas/{id}` | Actualiza una tarea |
| DELETE | `/tareas/{id}` | Elimina una tarea |

## Cómo correrlo localmente

### Requisitos
- Java 17+
- Maven

### Pasos

```bash
./mvnw spring-boot:run
```

La aplicación queda disponible en `http://localhost:8080` (la interfaz web en la raíz, la API en `/tareas`).

### Con Docker

```bash
docker compose up
```
