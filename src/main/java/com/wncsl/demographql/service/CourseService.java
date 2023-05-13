package com.wncsl.demographql.service;


import com.wncsl.demographql.domain.Category;
import com.wncsl.demographql.domain.Course;
import com.wncsl.demographql.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public Course create(Course course){
        return courseRepository.save(course);
    }

    public List<Course> listAll(){
        return courseRepository.findAll();
    }

}
