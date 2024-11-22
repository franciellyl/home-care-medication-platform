package spring.service.impl;

import org.springframework.stereotype.Component;
import spring.dto.PatientDTO;
import spring.mapper.PatientMapper;
import spring.repository.PatientRepository;
import spring.service.PatientService;

import java.util.List;

@Component
public class PatientServiceImpl implements PatientService {

    private final PatientRepository patientRepository;
    private final PatientMapper mapper;

    public PatientServiceImpl(PatientRepository patientRepository, PatientMapper mapper) {
        this.patientRepository = patientRepository;
        this.mapper = mapper;
    }

    @Override
    public List<PatientDTO> getAllPatient() {
        var patientResult = patientRepository.findAll();
        return mapper.entityToDTO(patientResult);
    }
}
