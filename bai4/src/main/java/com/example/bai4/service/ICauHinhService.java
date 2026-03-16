package com.example.bai4.service;

import com.example.bai4.entity.CauHinhEmail;

public interface ICauHinhService {
    CauHinhEmail layCauHinh();

    void capNhat(CauHinhEmail cauHinhEmail);
}
