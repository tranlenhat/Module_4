package com.example.website_dien_tu.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Table(name = "nguoi_dung")
public class NguoiDung {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ten;
    private String email;
    private String matKhau;
    private String vaiTro;

    @OneToMany(mappedBy = "nguoiDung")
    private List<DonHang> donHangs;

    @OneToMany(mappedBy = "nguoiDung")
    private List<GioHang> gioHangs;

}