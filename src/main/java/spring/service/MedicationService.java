package spring.service;

import org.springframework.stereotype.Service;
import spring.dto.MedicationDTO;
import spring.entity.MedicationEntity;

import java.util.List;

@Service
public interface MedicationService {
    List<MedicationDTO> getAllMedications();
}
