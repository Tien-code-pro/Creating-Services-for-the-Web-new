package com.example.luongminhtien.repository;

import com.example.luongminhtien.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product,Integer> {
}
