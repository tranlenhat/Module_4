package com.example.bai4.repository;

import com.example.bai4.entity.CauHinhEmail;

public interface ICauHinhRepository {
    CauHinhEmail layCauHinh();

    void capNhat(CauHinhEmail cauHinhEmail);
}
