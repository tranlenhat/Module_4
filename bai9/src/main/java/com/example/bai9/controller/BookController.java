package com.example.bai9.controller;

import com.example.bai9.Service.ILibraryService;
import com.example.bai9.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
@Controller
public class BookController {
    @Autowired
    private ILibraryService libraryService;

    @GetMapping("/")
    public String showList(Model model) {
        model.addAttribute("books", libraryService.findAll());
        return "list";
    }

    @GetMapping("/return")
    public String showReturnPage() {
        return "return";
    }
    @PostMapping("/borrow/{id}")
    public String borrow(@PathVariable Long id, Model model) {
        try {
            String code = libraryService.borrowBook(id);

            model.addAttribute("message", "Mượn sách thành công!");
            model.addAttribute("code", code);

            return "result";

        } catch (Exception e) {
            model.addAttribute("error", e.getMessage());
            return "error";
        }
    }
}