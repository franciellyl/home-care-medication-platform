package spring.service.impl;

import org.springframework.stereotype.Component;
import spring.dto.MedicationDTO;
import spring.entity.MedicationEntity;
import spring.mapper.MedicationMapper;
import spring.repository.MedicationRepository;
import spring.service.MedicationService;

import java.util.List;

@Component
public class MedicationServiceImpl implements MedicationService {

    private final MedicationRepository medicationRepository;
    private final MedicationMapper mapper;

    public MedicationServiceImpl(MedicationRepository medicationRepository, MedicationMapper mapper) {
        this.medicationRepository = medicationRepository;
        this.mapper = mapper;
    }

    @Override
    public List<MedicationDTO> getAllMedications() {
        var medicationResult = medicationRepository.findAll();
        return mapper.entityListToDTO(medicationResult);
    }
}
