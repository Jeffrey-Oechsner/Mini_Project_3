package com.example.order_service.Service;

import com.example.order_service.rabbit_Publisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class order_Service {
    private final rabbit_Publisher publisher;
    public void create(){
        publisher.orderEvent("");
    }
    @Autowired
    public order_Service(rabbit_Publisher publisher){this.publisher = publisher;}
}
