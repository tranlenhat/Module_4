package com.example.tao_ung_block.rest_controller;

import com.example.tao_ung_block.entity.Blog;
import com.example.tao_ung_block.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("api/v1/blogs")
public class BlogRestController {

    @Autowired
    private IBlogService blogService;
    @GetMapping("")
    public ResponseEntity<List<Blog>> getAll() {
        List<Blog> blogs = blogService.findAll();
        if (blogs.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blogs, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Blog> findById(@PathVariable Long id) {
        Blog blog = blogService.findById(id);
        if (blog == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(blog, HttpStatus.OK);
    }

    @GetMapping("/category/{categoryId}")
    public ResponseEntity<List<Blog>> findByCategory(@PathVariable Long categoryId) {
        List<Blog> blogs = blogService.findByCategoryId(categoryId);
        if (blogs.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blogs, HttpStatus.OK);
    }
    @PostMapping("")
    public ResponseEntity<Blog> create(@RequestBody Blog blog) {
        blogService.save(blog);
        return new ResponseEntity<>(blog, HttpStatus.CREATED);
    }
}