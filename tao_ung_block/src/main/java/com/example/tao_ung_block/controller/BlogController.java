package com.example.tao_ung_block.controller;

import com.example.tao_ung_block.entity.Blog;
import com.example.tao_ung_block.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/blogs")
public class BlogController {

    @Autowired
    private IBlogService blogService;

    @GetMapping("")
    public String showList(
            @RequestParam(name = "page", required = false, defaultValue = "0") int page,
            @RequestParam(name = "keyword", required = false, defaultValue = "") String keyword,
            ModelMap model
    ) {
        Sort sort = Sort.by("createdAt").descending();
        Pageable pageable = PageRequest.of(page, 2, sort);
        Page<Blog> blogs = blogService.search(keyword, pageable);
        model.addAttribute("blogs", blogs);
        model.addAttribute("keyword", keyword);
        return "blog/list";
    }

    @GetMapping("/create")
    public String showCreateForm(ModelMap model) {
        model.addAttribute("blog", new Blog());
        return "blog/create";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Blog blog) {
        blogService.save(blog);
        return "redirect:/blogs";
    }

    @GetMapping("/edit/{id}")
    public String showEdit(@PathVariable Long id, ModelMap model) {
        model.addAttribute("blog", blogService.findById(id));
        return "blog/edit";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute Blog blog) {
        blogService.save(blog);
        return "redirect:/blogs";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        blogService.delete(id);
        return "redirect:/blogs";
    }
}