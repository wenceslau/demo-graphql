package com.wncsl.demographql.resolver;

import com.wncsl.demographql.domain.Category;
import com.wncsl.demographql.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class CategoryResolver {

    @Autowired
    private CategoryService categoryService;

    @QueryMapping
    public List<Category> categories() {
        return categoryService.listAll();
    }

    @MutationMapping
    public Category createCategory(@Argument("input") Category newCategory) {
        System.out.println(newCategory);
        return categoryService.create(newCategory);
    }

}
