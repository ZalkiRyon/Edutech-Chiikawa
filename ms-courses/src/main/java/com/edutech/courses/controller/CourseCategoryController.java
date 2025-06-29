package com.edutech.courses.controller;

import com.edutech.common.dto.CourseCategoryDTO;
import com.edutech.courses.service.CourseCategoryService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Temporalmente comentado para evitar conflictos con SpringDoc
// import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;
// import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
// import org.springframework.hateoas.EntityModel;

@RestController
@RequestMapping("/api/course-categories")
@RequiredArgsConstructor
public class CourseCategoryController {

    private final CourseCategoryService categService;

    @GetMapping
    public ResponseEntity<List<CourseCategoryDTO>> findAll() {
        return ResponseEntity.ok(categService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<CourseCategoryDTO> findById(@PathVariable Integer id) {
        return ResponseEntity.ok(categService.findById(id));
    }

    @PostMapping
    public ResponseEntity<CourseCategoryDTO> create(@RequestBody @Valid CourseCategoryDTO dto) {
        return ResponseEntity.ok(categService.create(dto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<CourseCategoryDTO> update(@PathVariable Integer id, @RequestBody @Valid CourseCategoryDTO dto) {
        return ResponseEntity.ok(categService.update(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        categService.delete(id);
        return ResponseEntity.noContent().build();
    }

    /*
    @GetMapping("/{id}/hateoas")
    public EntityModel<CourseCategoryDTO> findByIdWithHateoas(@PathVariable Integer id) {
        CourseCategoryDTO category = categService.findById(id);
        EntityModel<CourseCategoryDTO> resource = EntityModel.of(category);
        resource.add(linkTo(methodOn(CourseCategoryController.class).findByIdWithHateoas(id)).withSelfRel());
        return resource;
    }
    */
}
