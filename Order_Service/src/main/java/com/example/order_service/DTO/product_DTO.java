package com.example.order_service.DTO;

import jakarta.validation.constraints.NotNull;

public class product_DTO {
    @NotNull
    private long product_id;
    @NotNull
    private long quantity;

    public product_DTO(){

    }
    public product_DTO(long product_id, long quantity) {
        this.product_id = product_id;
        this.quantity = quantity;
    }

    public long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(long product_id) {
        this.product_id = product_id;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }
}
