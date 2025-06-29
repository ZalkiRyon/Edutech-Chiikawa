package com.edutech.courses.entity;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.Instant;

class CourseCommentTest {

    @Test
    void testCourseCommentProperties() {
        CourseComment comment = new CourseComment();
        comment.setId(1);
        comment.setCourseId(101);
        comment.setUserId(202);
        comment.setCommentText("Great course!");
        comment.setRating(5);
        comment.setCreatedAt(Instant.now());

        assertEquals(1, comment.getId());
        assertEquals(101, comment.getCourseId());
        assertEquals(202, comment.getUserId());
        assertEquals("Great course!", comment.getCommentText());
        assertEquals(5, comment.getRating());
        assertNotNull(comment.getCreatedAt());
    }
}
