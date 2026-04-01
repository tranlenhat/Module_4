package com.example.website_dien_tu.repository;

import com.example.website_dien_tu.entity.ChiTietDonHang;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IChiTietDonHangRepository extends JpaRepository<ChiTietDonHang,Long> {
    List<ChiTietDonHang> findByDonHang_Id(Long orderId);
}
