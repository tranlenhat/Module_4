package com.example.website_dien_tu.service;

import com.example.website_dien_tu.entity.NguoiDung;

import java.util.List;

public interface INguoiDungService {
    List<NguoiDung> getAll();
    NguoiDung getById(Long id);
    NguoiDung create(NguoiDung user);
    NguoiDung update(Long id,NguoiDung user);
    void delete(Long id);
}
