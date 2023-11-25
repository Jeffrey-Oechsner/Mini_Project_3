package com.example.order_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.amqp.rabbit.core.RabbitTemplate;

@Service
public class rabbit_Publisher {
    private final RabbitTemplate rabbitTemplate;

    @Autowired
    public rabbit_Publisher(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void orderEvent(String message) {
        rabbitTemplate.convertAndSend("", "orderCreated", message);
    }
}
