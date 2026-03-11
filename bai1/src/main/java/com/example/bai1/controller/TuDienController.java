package com.example.bai1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
public class TuDienController {

    private static Map<String, String> tuDien = new HashMap<>();

    static {
        tuDien.put("hello", "xin chao");
        tuDien.put("book", "quyen sach");
        tuDien.put("computer", "may tinh");
    }
    @GetMapping("/tu-dien")
    public String hienThiTrangTuDien() {
        return "dictionary";
    }

    @PostMapping("/tra-cuu")
    public String traCuu(@RequestParam String tuTiengAnh, Model model) {
        String ketQua = tuDien.get(tuTiengAnh.toLowerCase());
        if (ketQua == null) {
            ketQua = "Khong tim thay";
        }
        model.addAttribute("ketQua", ketQua);

        return "dictionary";
    }
}