package spring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.entity.PatientEntity;
import spring.repository.PatientRepository;
import spring.service.PatientService;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientRepository patientRepository;

    @Override
    public List<PatientEntity> getAllPatient() {
        var patientResult = patientRepository.findAll();

        return patientResult;
    }
}
