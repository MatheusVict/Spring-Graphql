package io.matheusvictor.springwithgraphql.controller;

import io.matheusvictor.springwithgraphql.domain.product.Product;
import io.matheusvictor.springwithgraphql.dto.ProductInput;
import io.matheusvictor.springwithgraphql.repository.ProductRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class ProductController {

    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @MutationMapping
    public Product addProduct(@Argument ProductInput productInput) {
        return this.productRepository.save(new Product(productInput.name(), productInput.price(), productInput.categoryId()));
    }

    @QueryMapping
    public Iterable<Product> getAllProducts() {
        return this.productRepository.findAll();
    }
}
