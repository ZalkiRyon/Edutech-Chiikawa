package com.edutech.courses.entity;

import java.time.Instant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "enrollment")
public class Enrollment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @JoinColumn(name = "course_id", nullable = false)
    private Integer courseId;

    @JoinColumn(name = "user_id", nullable = false)
    private Integer userId;

    @Column(name = "enrollment_date", nullable = false)
    private Instant enrollmentDate;

    @Column(name = "status", nullable = false, length = 50)
    private String status;
}
