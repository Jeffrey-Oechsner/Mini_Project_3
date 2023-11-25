package com.example.order_service.Service;

import com.example.order_service.DTO.order_DTO;
import com.example.order_service.rabbit_Publisher;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;


@Service
public class order_Service {
    private final rabbit_Publisher publisher;
    public void create(order_DTO order){
        JSONObject json = new JSONObject(order);
        publisher.orderEvent(json.toString());
    }
    @Autowired
    public order_Service(rabbit_Publisher publisher){this.publisher = publisher;}
}
