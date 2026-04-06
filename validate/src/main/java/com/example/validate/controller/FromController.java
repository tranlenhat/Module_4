package com.example.validate.controller;

import com.example.validate.Service.UserService;
import com.example.validate.dto.UserDTO;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FromController {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("userDTO", new UserDTO());
        return "index";
    }

    @PostMapping("/register")
    public String registerUser(
            @Valid @ModelAttribute("userDTO") UserDTO userDTO,
            BindingResult result,
            Model model
    ) {

        if (result.hasErrors()) {
            return "index";
        }
        userService.save(userDTO);

        model.addAttribute("user", userDTO);

        return "result";
    }
}
