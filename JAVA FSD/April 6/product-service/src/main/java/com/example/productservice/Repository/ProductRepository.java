package com.example.productservice.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.productservice.domain.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer>{
}