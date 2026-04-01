package com.example.website_dien_tu.service;

import com.example.website_dien_tu.entity.NguoiDung;
import com.example.website_dien_tu.repository.INguoiDungRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NguoiDungService implements INguoiDungService{

    @Autowired
    private INguoiDungRepository nguoiDungRepository;
    @Override
    public List<NguoiDung> getAll() {
        return nguoiDungRepository.findAll();
    }

    @Override
    public NguoiDung getById(Long id) {
        return nguoiDungRepository.findById(id).orElse(null);
    }

    @Override
    public NguoiDung create(NguoiDung user) {
        return nguoiDungRepository.save(user);
    }

    @Override
    public NguoiDung update(Long id, NguoiDung user) {
        user.setId(id);
        return nguoiDungRepository.save(user);
    }

    @Override
    public void delete(Long id) {
        nguoiDungRepository.deleteById(id);
    }
}
