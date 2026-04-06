package com.example.tao_ung_block.repository;

import com.example.tao_ung_block.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoryRepository extends JpaRepository<Category,Long> {

}
