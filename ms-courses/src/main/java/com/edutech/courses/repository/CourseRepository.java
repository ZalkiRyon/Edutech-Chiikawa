package com.edutech.courses.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edutech.courses.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {

}
