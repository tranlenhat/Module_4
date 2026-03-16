package com.example.bai4.service;

import com.example.bai4.entity.CauHinhEmail;
import com.example.bai4.repository.ICauHinhRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CauHinhService implements ICauHinhService{
    @Autowired
    private ICauHinhRepository cauHinhRepository;

    @Override
    public CauHinhEmail layCauHinh() {
        return cauHinhRepository.layCauHinh();
    }

    @Override
    public void capNhat(CauHinhEmail cauHinhEmail) {
        cauHinhRepository.capNhat(cauHinhEmail);
    }
}
