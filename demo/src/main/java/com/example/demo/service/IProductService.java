package com.example.demo.service;

import com.example.demo.entity.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
    void save(Product product);
    Product findById(int id);
    void update(Product product);
    void delete(int id);
}
