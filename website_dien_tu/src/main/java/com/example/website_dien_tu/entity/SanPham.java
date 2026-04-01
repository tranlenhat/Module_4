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
@Table(name = "san_pham")
public class SanPham {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ten;
    private Double gia;
    private Integer soLuong;
    private String moTa;
    private String hinhAnh;

    @ManyToOne
    @JoinColumn(name = "danh_muc_id")
    private DanhMuc danhMuc;

    @OneToMany(mappedBy = "sanPham")
    private List<ChiTietDonHang> chiTietDonHangs;

    @OneToMany(mappedBy = "sanPham")
    private List<GioHang> gioHangs;

}
