package io.matheusvictor.springwithgraphql.repository;

import io.matheusvictor.springwithgraphql.domain.category.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CategoryRepository extends JpaRepository<Category, UUID> {
}
