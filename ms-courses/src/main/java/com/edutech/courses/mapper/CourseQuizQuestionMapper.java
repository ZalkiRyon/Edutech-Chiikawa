package com.edutech.courses.mapper;

import com.edutech.common.dto.CourseQuizQuestionDTO;
import com.edutech.courses.entity.CourseQuizQuestion;

import org.springframework.stereotype.Component;

/**
 * Mapper manual para CourseQuizQuestion debido a problemas de compatibilidad con MapStruct.
 * Este mapper realiza la conversión entre entidad y DTO de forma manual.
 */
@Component
public class CourseQuizQuestionMapper {
    
    /**
     * Convierte una entidad CourseQuizQuestion a su DTO correspondiente.
     */
    public CourseQuizQuestionDTO toDTO(CourseQuizQuestion entity) {
        if (entity == null) {
            return null;
        }
        
        CourseQuizQuestionDTO dto = new CourseQuizQuestionDTO();
        dto.setId(entity.getId());
        dto.setQuizId(entity.getQuizId());
        dto.setQuestionText(entity.getQuestionText());
        dto.setOptionA(entity.getOptionA());
        dto.setOptionB(entity.getOptionB());
        dto.setOptionC(entity.getOptionC());
        dto.setOptionD(entity.getOptionD());
        dto.setOptionE(entity.getOptionE());
        dto.setCorrectAnswer(entity.getCorrectAnswer());
        dto.setCorrectOption(entity.getCorrectOption());
        dto.setOrderIndex(entity.getOrderIndex());
        dto.setCreatedAt(entity.getCreatedAt());
        
        return dto;
    }

    /**
     * Convierte un DTO CourseQuizQuestionDTO a su entidad correspondiente.
     */
    public CourseQuizQuestion toEntity(CourseQuizQuestionDTO dto) {
        if (dto == null) {
            return null;
        }
        
        CourseQuizQuestion entity = new CourseQuizQuestion();
        entity.setId(dto.getId());
        entity.setQuizId(dto.getQuizId());
        entity.setQuestionText(dto.getQuestionText());
        entity.setOptionA(dto.getOptionA());
        entity.setOptionB(dto.getOptionB());
        entity.setOptionC(dto.getOptionC());
        entity.setOptionD(dto.getOptionD());
        entity.setOptionE(dto.getOptionE());
        entity.setCorrectAnswer(dto.getCorrectAnswer());
        entity.setCorrectOption(dto.getCorrectOption());
        entity.setOrderIndex(dto.getOrderIndex());
        entity.setCreatedAt(dto.getCreatedAt());
        
        return entity;
    }
}
