package spring.mapper;

import org.mapstruct.Mapper;
import spring.dto.MedicationDTO;
import spring.entity.MedicationEntity;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MedicationMapper {
    MedicationDTO entityToMedicationDTO(MedicationEntity entity);

    List<MedicationDTO> entityListToDTO(List<MedicationEntity> entity);
}
