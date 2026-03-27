package com.example.tao_ung_block.service;

import com.example.tao_ung_block.entity.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IBlogService {

    Page<Blog> search(String keyword, Pageable pageable);
    Blog findById(Long id);

    void save(Blog blog);

    void delete(Long id);
}