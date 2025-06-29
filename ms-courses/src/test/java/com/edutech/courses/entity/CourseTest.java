package com.edutech.courses.entity;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.time.LocalDate;

class CourseTest {

    @Test
    void testCourseEntity() {
        Course course = new Course();
        course.setId(1);
        course.setTitle("Test Course");
        course.setDescription("Test Description");
        course.setCategoryId(2);
        course.setManagerId(3);
        course.setInstructorId(4);
        course.setPublishDate(LocalDate.of(2025, 6, 29));
        course.setPrice(new BigDecimal("99.99"));
        course.setImage("test.jpg");
        course.setStatus("Enabled");

        assertEquals(1, course.getId());
        assertEquals("Test Course", course.getTitle());
        assertEquals("Test Description", course.getDescription());
        assertEquals(2, course.getCategoryId());
        assertEquals(3, course.getManagerId());
        assertEquals(4, course.getInstructorId());
        assertEquals(LocalDate.of(2025, 6, 29), course.getPublishDate());
        assertEquals(new BigDecimal("99.99"), course.getPrice());
        assertEquals("test.jpg", course.getImage());
        assertEquals("Enabled", course.getStatus());
    }
}
