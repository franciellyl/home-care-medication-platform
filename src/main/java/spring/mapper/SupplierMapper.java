package spring.mapper;

import org.mapstruct.Mapper;
import spring.dto.SupplierDTO;
import spring.entity.SupplierEntity;

@Mapper(componentModel = "spring")
public interface SupplierMapper {

    SupplierDTO entityToSupplierDTO(SupplierEntity entity);
}
