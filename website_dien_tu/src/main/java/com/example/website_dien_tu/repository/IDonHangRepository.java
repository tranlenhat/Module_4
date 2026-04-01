package com.example.website_dien_tu.repository;

import com.example.website_dien_tu.entity.DonHang;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IDonHangRepository extends JpaRepository<DonHang, Long> {
    List<DonHang> findByNguoiDung_Id(Long userId);
}
