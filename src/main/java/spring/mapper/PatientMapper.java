package spring.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import spring.dto.PatientDTO;
import spring.entity.PatientEntity;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PatientMapper {
    List<PatientDTO> entityToDTO(List<PatientEntity> entity);
}
