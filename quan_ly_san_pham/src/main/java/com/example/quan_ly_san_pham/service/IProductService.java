package com.example.quan_ly_san_pham.service;

import com.example.quan_ly_san_pham.entity.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
    void save(Product product);
    Product findById(int id);
    void update(Product product);
}
