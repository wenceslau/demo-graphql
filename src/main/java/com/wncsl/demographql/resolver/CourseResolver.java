package com.wncsl.demographql.resolver;

import com.wncsl.demographql.domain.Category;
import com.wncsl.demographql.domain.Course;
import com.wncsl.demographql.service.CategoryService;
import com.wncsl.demographql.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class CourseResolver {

    @Autowired
    private CourseService courseService;

    @QueryMapping
    public List<Course> courses() {
        return courseService.listAll();
    }

    @MutationMapping
    public Course createCourse(@Argument("input") Course newCourse) {
        System.out.println(newCourse);
        return courseService.create(newCourse);
    }

}
