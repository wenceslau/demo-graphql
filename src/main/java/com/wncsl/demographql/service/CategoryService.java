package com.wncsl.demographql.service;


import com.wncsl.demographql.domain.Category;
import com.wncsl.demographql.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public Category create(Category category){
        return categoryRepository.save(category);
    }

    public List<Category> listAll(){
        return categoryRepository.findAll();
    }

}
