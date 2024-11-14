package spring.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public record PatientResponseDTO(
        String id,
        String name,
        String telefone,
        String endereco,
        Integer medicationId

) {
}
