package com.wncsl.demographql.controller;

import com.wncsl.demographql.domain.Category;
import com.wncsl.demographql.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @GetMapping()
    public ResponseEntity<Object> listAll() {
        return ResponseEntity.status(HttpStatus.CREATED).body(categoryService.listAll());
    }

    @PostMapping
    public ResponseEntity<Object> create(@RequestBody Category category) {
        return ResponseEntity.status(HttpStatus.CREATED).body(categoryService.create(category));
    }


}
