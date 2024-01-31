package io.matheusvictor.springwithgraphql.repository;

import io.matheusvictor.springwithgraphql.domain.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, UUID> {
}
