package com.example.quan_ly_san_pham.repository;

import com.example.quan_ly_san_pham.entity.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> findAll();
    void save(Product product);
    Product findById(int id);
    void update(Product product);
}
