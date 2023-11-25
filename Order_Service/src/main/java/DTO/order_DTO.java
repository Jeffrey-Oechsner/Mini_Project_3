package DTO;

import jakarta.validation.constraints.NotNull;

import java.util.List;

public class order_DTO {
    @NotNull
    List<product_DTO> products;

    public order_DTO(List<product_DTO> products) {
        this.products = products;
    }

    public List<product_DTO> getProducts() {
        return products;
    }

    public void setProducts(List<product_DTO> products) {
        this.products = products;
    }

}
