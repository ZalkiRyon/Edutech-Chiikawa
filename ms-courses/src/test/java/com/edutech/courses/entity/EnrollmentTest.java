package com.edutech.courses.entity;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.Instant;

class EnrollmentTest {

    @Test
    void testEnrollmentProperties() {
        Enrollment enrollment = new Enrollment();
        enrollment.setId(1);
        enrollment.setCourseId(101);
        enrollment.setUserId(202);
        enrollment.setEnrollmentDate(Instant.now());
        enrollment.setStatus("Active");

        assertEquals(1, enrollment.getId());
        assertEquals(101, enrollment.getCourseId());
        assertEquals(202, enrollment.getUserId());
        assertNotNull(enrollment.getEnrollmentDate());
        assertEquals("Active", enrollment.getStatus());
    }
}
