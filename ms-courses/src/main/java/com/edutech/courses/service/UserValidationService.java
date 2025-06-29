package com.edutech.courses.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edutech.courses.client.UserClient;
import com.edutech.common.dto.UserDTO;

@Service
public class UserValidationService {

    @Autowired
    private UserClient userClient;

    public boolean isUserValid(Integer userId) {
        UserDTO user = userClient.findById(userId);
        return user != null && user.isActive();
    }

    public boolean isRoleValid(Integer roleId) {
        // Implementar lógica para validar roles según la base de datos
        // Por ejemplo, verificar si el roleId existe en la tabla role
        return true; // Placeholder
    }
}
