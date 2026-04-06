package com.example.tao_ung_block.service;

import com.example.tao_ung_block.entity.Blog;
import com.example.tao_ung_block.repository.IBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BlogService implements IBlogService{
    @Autowired
    private IBlogRepository blogRepository;
    @Override
    public Page<Blog> search(String keyword, Pageable pageable) {
        if (keyword == null || keyword.trim().isEmpty()) {
            return blogRepository.findAll(pageable);
        }
        return blogRepository.findByTitleContaining(keyword, pageable);
    }
    @Override
    public Blog findById(Long id) {
        return blogRepository.findById(id).orElse(null);
    }
    @Override
    public void save(Blog blog) {
        blogRepository.save(blog);
    }
    @Override
    public void delete(Long id) {
        blogRepository.deleteById(id);
    }

    @Override
    public List<Blog> findAll() {
        return blogRepository.findAll();
    }

    @Override
    public List<Blog> findByCategoryId(Long categoryId) {
        return blogRepository.findByCategoryId(categoryId);
    }
}
