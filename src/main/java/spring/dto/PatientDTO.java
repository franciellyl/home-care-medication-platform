package spring.dto;

import lombok.Builder;
@Builder
public record PatientDTO(
        String id,
        String name,
        String telefone,
        String endereco,
        Integer medicationId

) {
}
