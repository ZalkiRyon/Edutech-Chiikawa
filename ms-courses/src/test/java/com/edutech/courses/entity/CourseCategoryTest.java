package com.edutech.courses.entity;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CourseCategoryTest {

    @Test
    void testCourseCategoryProperties() {
        CourseCategory category = new CourseCategory();
        category.setId(1);
        category.setName("Programming");
        category.setDescription("Courses related to programming languages.");

        assertEquals(1, category.getId());
        assertEquals("Programming", category.getName());
        assertEquals("Courses related to programming languages.", category.getDescription());
    }
}
