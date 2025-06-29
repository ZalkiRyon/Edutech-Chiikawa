package com.edutech.courses.entity;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CourseContentTest {

    @Test
    void testCourseContentProperties() {
        CourseContent content = new CourseContent();
        content.setId(1);
        content.setCourseId(101);
        content.setTitle("Introduction to Java");
        content.setContentType("Video");
        content.setUrl("http://example.com/java-intro");
        content.setOrderIndex(1);

        assertEquals(1, content.getId());
        assertEquals(101, content.getCourseId());
        assertEquals("Introduction to Java", content.getTitle());
        assertEquals("Video", content.getContentType());
        assertEquals("http://example.com/java-intro", content.getUrl());
        assertEquals(1, content.getOrderIndex());
    }
}
