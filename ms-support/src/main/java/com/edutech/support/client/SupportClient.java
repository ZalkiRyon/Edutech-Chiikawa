package com.edutech.support.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;

@FeignClient(name = "ms-support", url = "http://localhost:8080/support")
public interface SupportClient {

    @GetMapping("/api/support/{id}")
    SupportDTO getSupportById(@PathVariable("id") Long id);

    @GetMapping("/api/support")
    List<SupportDTO> getAllSupport();
}
