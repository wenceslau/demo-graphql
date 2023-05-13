package com.wncsl.demographql;

import com.wncsl.demographql.domain.Category;
import com.wncsl.demographql.domain.Course;
import com.wncsl.demographql.service.CategoryService;
import com.wncsl.demographql.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
public class DemoGraphqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoGraphqlApplication.class, args);
	}

	@Autowired
	private CategoryService categoryService;
	@Autowired
	private CourseService courseService;

	@Bean
	public CommandLineRunner CommandLineRunnerBean() {
		return (args) -> {
			Category category = new Category("Cat1", "DescCat1");
			categoryService.create(category);
			Course course = new Course("Cour1", "DescCour1", category);
			courseService.create(course);
			System.out.println("Category created " + category.getId());
			System.out.println("Course created " + course.getId());
		};
	}

}
