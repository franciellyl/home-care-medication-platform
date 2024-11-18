package spring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import spring.entity.MedicationEntity;
import spring.repository.MedicationRepository;
import spring.service.MedicationService;

import java.util.List;

@Component
public class MedicationServiceImpl implements MedicationService {

    @Autowired
    private MedicationRepository medicationRepository;

    @Override
    public List<MedicationEntity> getAllMedications() {
        var result =  medicationRepository.findAll();
        return result;
    }
}
