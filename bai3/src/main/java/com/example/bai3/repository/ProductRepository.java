package com.example.bai3.repository;

import com.example.bai3.entity.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository implements IProductRepository {

    private static List<Product> productList = new ArrayList<>();
    static {
        productList.add(new Product(1,"Iphone",2000,"Điện thoại","Apple"));
        productList.add(new Product(2,"Samsung",1500,"Điện thoại","Samsung"));
        productList.add(new Product(3,"Xiaomi",1000,"Điện thoại","Xiaomi"));
    }
    @Override
    public List<Product> findAll() {
        return productList;
    }
}