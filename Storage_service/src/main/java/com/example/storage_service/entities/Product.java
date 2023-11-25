package com.example.storage_service.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "products")
@Entity
public class Product {
@Id
    private long id;
@Column(name = "quantity")
    private long quantity;

    public Product(){

    }
    public Product(long product_id, long quantity) {
        this.id = product_id;
        this.quantity = quantity;
    }

    public long getId() {
        return id;
    }

    public void setId(long product_id) {
        this.id = product_id;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }
}
