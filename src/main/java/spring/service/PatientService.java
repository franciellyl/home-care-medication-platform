package spring.service;

import org.springframework.stereotype.Service;
import spring.entity.PatientEntity;

import java.util.List;

@Service
public interface PatientService {

    List<PatientEntity> getAllPatient();
}
