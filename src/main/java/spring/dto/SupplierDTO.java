package spring.dto;

import lombok.Builder;

@Builder
public record SupplierDTO(
        String name,
        String documentNumber,
        String telefone,
        Boolean isActive
) {
}
