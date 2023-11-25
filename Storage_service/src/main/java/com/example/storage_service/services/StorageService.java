package com.example.storage_service.services;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class StorageService {
    @RabbitListener(queues = "orderCreated")
    public void receiveMessage(String message) {
        System.out.println("Received <" + message + ">");
    }
}

