package com.example.order_service.Controller;

import com.example.order_service.DTO.order_DTO;
import com.example.order_service.Service.order_Service;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class order_Controller {
    private final order_Service service;
    @Autowired
    public order_Controller(order_Service service) {
        this.service = service;
    }

    @PostMapping(value = "/createorder")
    public void createorder(@Valid @RequestBody order_DTO order){
        service.create(order);
    }

}
