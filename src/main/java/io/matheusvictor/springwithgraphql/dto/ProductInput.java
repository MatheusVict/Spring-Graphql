package io.matheusvictor.springwithgraphql.dto;

import java.math.BigDecimal;
import java.util.UUID;

public record ProductInput(
        String name,
        BigDecimal price,
        UUID categoryId
) {
}
