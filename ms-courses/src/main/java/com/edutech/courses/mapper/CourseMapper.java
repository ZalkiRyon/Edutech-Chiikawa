package com.edutech.courses.mapper;

import com.edutech.common.dto.CourseDTO;
import com.edutech.courses.entity.Course;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CourseMapper {
    @Mapping(target = "id", source = "entity.id")
    @Mapping(target = "title", source = "entity.title")
    @Mapping(target = "description", source = "entity.description")
    @Mapping(target = "categoryId", source = "entity.categoryId")
    @Mapping(target = "managerId", source = "entity.managerId")
    @Mapping(target = "instructorId", source = "entity.instructorId")
    @Mapping(target = "publishDate", source = "entity.publishDate")
    @Mapping(target = "price", source = "entity.price")
    @Mapping(target = "image", source = "entity.image")
    @Mapping(target = "status", source = "entity.status")
    CourseDTO toDTO(Course entity);

    @Mapping(target = "id", source = "dto.id")
    @Mapping(target = "title", source = "dto.title")
    @Mapping(target = "description", source = "dto.description")
    @Mapping(target = "categoryId", source = "dto.categoryId")
    @Mapping(target = "managerId", source = "dto.managerId")
    @Mapping(target = "instructorId", source = "dto.instructorId")
    @Mapping(target = "publishDate", source = "dto.publishDate")
    @Mapping(target = "price", source = "dto.price")
    @Mapping(target = "image", source = "dto.image")
    @Mapping(target = "status", source = "dto.status")
    Course toEntity(CourseDTO dto);
}
