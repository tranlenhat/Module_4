package com.example.tao_ung_block.repository;

import com.example.tao_ung_block.entity.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBlogRepository extends JpaRepository<Blog, Long> {
    Page<Blog> findByTitleContaining(String keyword, Pageable pageable);

}