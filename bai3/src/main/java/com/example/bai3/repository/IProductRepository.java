package com.example.bai3.repository;

import com.example.bai3.entity.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> findAll();
}
