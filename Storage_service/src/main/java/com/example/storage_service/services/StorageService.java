package com.example.storage_service.services;

import com.example.storage_service.Reposotory.Product_repository;
import com.example.storage_service.entities.Product;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StorageService {
    private final Product_repository product_repository;
    @Autowired
    public StorageService(Product_repository product_repository) {
        this.product_repository = product_repository;
    }
    @RabbitListener(queues = "orderCreated")
    public void receiveMessage(String message) {
        if (message == "0") return;
        System.out.println("Received <" + message + ">");
        JSONObject json = new JSONObject(message);
        JSONArray products = json.getJSONArray("products");
        for (int i = 0; i < products.length(); i++){
            JSONObject product = products.getJSONObject(i);
            product_repository.findById(product.getLong("product_id")).ifPresentOrElse(
                    (p) -> {
                        p.setQuantity(p.getQuantity() - product.getInt("quantity"));
                        product_repository.save(p);
                    },
                    () -> {
                        product_repository.save(new Product(product.getLong("product_id"), product.getInt("quantity")));
                    }
            );
        }
        System.out.println("Received <" + message + ">");
    }


}

