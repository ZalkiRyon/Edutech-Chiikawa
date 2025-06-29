package com.edutech.courses.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.edutech.common.dto.RoleDTO;
import com.edutech.courses.client.RoleClient;

@Service
public class RoleValidationService {

    @Autowired
    private RoleClient roleClient;

    public boolean isValidRole(String roleName) {
        RoleDTO role = roleClient.getRoleByName(roleName);
        return role != null && role.isActive();
    }
}