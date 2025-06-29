package com.edutech.courses.controller;

import com.edutech.common.dto.CourseDTO;
import com.edutech.courses.service.CourseService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

// Temporalmente comentado para evitar conflictos con SpringDoc
// import org.springframework.hateoas.EntityModel;
// import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
@RequiredArgsConstructor
@Tag(name = "Courses", description = "API para gestión de cursos")
public class CourseController {

    private final CourseService courseService;

    @GetMapping
    @Operation(summary = "Obtener todos los cursos", description = "Retorna una lista de todos los cursos disponibles")
    @ApiResponse(responseCode = "200", description = "Lista de cursos obtenida exitosamente")
    public ResponseEntity<List<CourseDTO>> findAll() {
        return ResponseEntity.ok(courseService.findAll());
    }

    @GetMapping("/{id}")
    @Operation(summary = "Obtener curso por ID", description = "Retorna un curso específico basado en su ID")
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "Curso encontrado exitosamente"),
        @ApiResponse(responseCode = "404", description = "Curso no encontrado")
    })
    public ResponseEntity<CourseDTO> findById(@Parameter(description = "ID del curso") @PathVariable Integer id) {
        return ResponseEntity.ok(courseService.findById(id));
    }

    @PostMapping
    @Operation(summary = "Crear nuevo curso", description = "Crea un nuevo curso en el sistema")
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "Curso creado exitosamente"),
        @ApiResponse(responseCode = "400", description = "Datos del curso inválidos")
    })
    public ResponseEntity<CourseDTO> create(@RequestBody @Valid CourseDTO dto) {
        return ResponseEntity.ok(courseService.create(dto));
    }

    @PutMapping("/{id}")
    @Operation(summary = "Actualizar curso", description = "Actualiza un curso existente")
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "Curso actualizado exitosamente"),
        @ApiResponse(responseCode = "404", description = "Curso no encontrado"),
        @ApiResponse(responseCode = "400", description = "Datos del curso inválidos")
    })
    public ResponseEntity<CourseDTO> update(@Parameter(description = "ID del curso") @PathVariable Integer id, @RequestBody @Valid CourseDTO dto) {
        return ResponseEntity.ok(courseService.update(id, dto));
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Eliminar curso", description = "Elimina un curso del sistema")
    @ApiResponses({
        @ApiResponse(responseCode = "204", description = "Curso eliminado exitosamente"),
        @ApiResponse(responseCode = "404", description = "Curso no encontrado")
    })
    public ResponseEntity<Void> delete(@Parameter(description = "ID del curso") @PathVariable Integer id) {
        courseService.delete(id);
        return ResponseEntity.noContent().build();
    }

    /*
    @GetMapping("/{id}/hateoas")
    @Operation(summary = "Obtener curso con HATEOAS", description = "Retorna un curso con enlaces HATEOAS")
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "Curso con enlaces HATEOAS obtenido exitosamente"),
        @ApiResponse(responseCode = "404", description = "Curso no encontrado")
    })
    public EntityModel<CourseDTO> findByIdWithHateoas(@Parameter(description = "ID del curso") @PathVariable Integer id) {
        CourseDTO course = courseService.findById(id);
        EntityModel<CourseDTO> resource = EntityModel.of(course);
        resource.add(WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(CourseController.class).findByIdWithHateoas(id)).withSelfRel());
        return resource;
    }
    */

    @GetMapping("/health")
    @Operation(summary = "Health check", description = "Endpoint simple para verificar que el servicio esté funcionando")
    @ApiResponse(responseCode = "200", description = "Servicio funcionando correctamente")
    public ResponseEntity<String> health() {
        return ResponseEntity.ok("MS-Courses is running!");
    }
}
