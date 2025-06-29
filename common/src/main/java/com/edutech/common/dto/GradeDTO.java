package com.edutech.common.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.Instant;

@Data
public class GradeDTO {

    @NotNull(message = "El ID de la calificación es obligatorio.")
    private Integer id;

    @NotNull(message = "Debe especificar el ID del estudiante.")
    private Integer studentId;

    @NotNull(message = "Debe especificar el ID del curso.")
    private Integer courseId;

    @NotNull(message = "Debe especificar la calificación.")
    private Double grade;

    @NotBlank(message = "Debe especificar el estado de la calificación.")
    @Size(max = 20, message = "El estado no puede exceder los 20 caracteres.")
    private String status;

    @NotNull(message = "La fecha de creación es obligatoria.")
    private Instant createdAt;
}
