package com.edutech.courses.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.edutech.common.dto.GradeDTO;

@FeignClient(name = "ms-grades")
public interface GradesClient {

    @GetMapping("/api/grades/{id}")
    GradeDTO findById(@PathVariable("id") Integer id);

    @GetMapping("/api/grades")
    List<GradeDTO> findAll();
}
