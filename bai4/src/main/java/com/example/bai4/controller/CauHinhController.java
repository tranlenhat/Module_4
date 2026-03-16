package com.example.bai4.controller;

import com.example.bai4.entity.CauHinhEmail;
import com.example.bai4.service.ICauHinhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CauHinhController {

    @Autowired
    private ICauHinhService cauHinhService;

    @GetMapping("/cau-hinh")
    public String hienThi(Model model) {
        CauHinhEmail cauHinh = cauHinhService.layCauHinh();
        model.addAttribute("cauHinh", cauHinh);
        return "settings";
    }

    @PostMapping("/cap-nhat")
    public String capNhat(@ModelAttribute("cauHinh") CauHinhEmail cauHinh) {
        cauHinhService.capNhat(cauHinh);
        return "redirect:/cau-hinh";
    }
}