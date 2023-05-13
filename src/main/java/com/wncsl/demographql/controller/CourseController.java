package com.wncsl.demographql.controller;

import com.wncsl.demographql.domain.Category;
import com.wncsl.demographql.domain.Course;
import com.wncsl.demographql.service.CategoryService;
import com.wncsl.demographql.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    CourseService courseService;

    @GetMapping()
    public ResponseEntity<Object> listAll() {
        return ResponseEntity.status(HttpStatus.CREATED).body(courseService.listAll());
    }

    @PostMapping
    public ResponseEntity<Object> create(@RequestBody Course course) {
        return ResponseEntity.status(HttpStatus.CREATED).body(courseService.create(course));
    }


}
