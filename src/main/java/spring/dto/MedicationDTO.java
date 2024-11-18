package spring.dto;

import lombok.Builder;

import java.util.Date;

@Builder
public record MedicationDTO(
        Long id,
        Long code,
        String name,
        String medicationLote,
        Date validationDate,
        Long supplierCode
) {
}
