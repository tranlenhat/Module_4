package com.example.website_dien_tu.repository;

import com.example.website_dien_tu.entity.NguoiDung;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface INguoiDungRepository extends JpaRepository<NguoiDung,Long> {
    Optional<NguoiDung> findByEmail(String email);
}
