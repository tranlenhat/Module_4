package com.example.website_dien_tu.repository;

import com.example.website_dien_tu.entity.SanPham;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ISanPhamRepository extends JpaRepository <SanPham,Long>{
    List<SanPham> findByTenContaining(String keyword);
    List<SanPham> findByDanhMuc_Id(Long danhMucId);
}
