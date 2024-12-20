package spring.dto;

import lombok.Builder;
@Builder
public record PatientDTO(
        String name,
        String telefone,
        String endereco,
        MedicationDTO medication

) {
}
