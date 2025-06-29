package com.edutech.courses.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.edutech.common.dto.RoleDTO;

@FeignClient(name = "ms-roles")
public interface RoleClient {

    @GetMapping("/roles/by-name")
    RoleDTO getRoleByName(@RequestParam("name") String name);
}