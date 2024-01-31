package io.matheusvictor.springwithgraphql.controller;

import io.matheusvictor.springwithgraphql.domain.category.Category;
import io.matheusvictor.springwithgraphql.dto.CategoryInput;
import io.matheusvictor.springwithgraphql.repository.CategoryRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.Optional;
import java.util.UUID;

@Controller
public class CategoryController {

    private final CategoryRepository categoryRepository;

    public CategoryController(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @MutationMapping
    // the argument name must be the same as the one in the schema
    public Category addCategory(@Argument CategoryInput category) {
        return this.categoryRepository.save(new Category(category.name()));
    }

    @QueryMapping
    public Optional<Category> categoryById(@Argument UUID id) {
        return this.categoryRepository.findById(id);
    }
}
