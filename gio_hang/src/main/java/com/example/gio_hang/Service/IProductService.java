package com.example.gio_hang.Service;

import com.example.gio_hang.entity.ProductDTO;

import java.util.List;

public interface IProductService {
    List<ProductDTO> findAll();
    ProductDTO findById(Integer id);
}
