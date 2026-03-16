package com.example.bai4.repository;

import com.example.bai4.entity.CauHinhEmail;
import org.springframework.stereotype.Repository;

@Repository
public class CauHinhRepository implements ICauHinhRepository {

    private CauHinhEmail cauHinhEmail =
            new CauHinhEmail("English",25,true,"Thor\nKing, Asgard");

    @Override
    public CauHinhEmail layCauHinh() {
        return cauHinhEmail;
    }

    @Override
    public void capNhat(CauHinhEmail cauHinhEmail) {
        this.cauHinhEmail = cauHinhEmail;
    }
}
