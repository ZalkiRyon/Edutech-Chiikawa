package com.edutech.courses.mapper;

import com.edutech.common.dto.CourseCommentDTO;
import com.edutech.courses.entity.CourseComment;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CourseCommentMapper {
    @Mapping(target = "id", source = "entity.id")
    @Mapping(target = "courseId", source = "entity.courseId")
    @Mapping(target = "userId", source = "entity.userId")
    @Mapping(target = "commentText", source = "entity.commentText")
    @Mapping(target = "rating", source = "entity.rating")
    @Mapping(target = "createdAt", source = "entity.createdAt")
    CourseCommentDTO toDTO(CourseComment entity);

    @Mapping(target = "id", source = "dto.id")
    @Mapping(target = "courseId", source = "dto.courseId")
    @Mapping(target = "userId", source = "dto.userId")
    @Mapping(target = "commentText", source = "dto.commentText")
    @Mapping(target = "rating", source = "dto.rating")
    @Mapping(target = "createdAt", source = "dto.createdAt")
    CourseComment toEntity(CourseCommentDTO dto);
}
