package com.example.storage_service.Reposotory;

import com.example.storage_service.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface Product_repository extends CrudRepository<Product, Long> {
}
