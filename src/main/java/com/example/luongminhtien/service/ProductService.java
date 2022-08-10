package com.example.luongminhtien.service;

import com.example.luongminhtien.entity.Product;
import com.example.luongminhtien.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    public Iterable<Product> findAll() {
        return productRepository.findAll();
    }
    public Product save(Product product) {
        return productRepository.save(product);
    }
}