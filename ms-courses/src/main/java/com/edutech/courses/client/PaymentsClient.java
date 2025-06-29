package com.edutech.courses.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.edutech.common.dto.PaymentDTO;

@FeignClient(name = "ms-payments")
public interface PaymentsClient {

    @GetMapping("/api/payments/{id}")
    PaymentDTO findById(@PathVariable("id") Integer id);

    @GetMapping("/api/payments")
    List<PaymentDTO> findAll();
}
