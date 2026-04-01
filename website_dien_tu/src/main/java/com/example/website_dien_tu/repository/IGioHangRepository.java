package com.example.website_dien_tu.repository;

import com.example.website_dien_tu.entity.DanhMuc;
import com.example.website_dien_tu.entity.GioHang;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface IGioHangRepository extends JpaRepository<DanhMuc,Long> {
    List<GioHang> findByNguoiDung_Id(Long userId);
    Optional<GioHang> findByNguoiDung_IdAndSanPham_Id(Long userId, Long productId);
}
