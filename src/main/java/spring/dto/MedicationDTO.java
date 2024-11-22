package spring.dto;

import lombok.Builder;

import java.util.Date;

@Builder
public record MedicationDTO(
        Long code,
        String name,
        String medicationLote,
        Date validationDate,
        SupplierDTO supplierCode
) {
}
