package spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.dto.MedicationDTO;
import spring.dto.PatientDTO;
import spring.entity.MedicationEntity;
import spring.entity.PatientEntity;
import spring.service.MedicationService;
import spring.service.PatientService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HomeCareController {
    @Autowired
    private PatientService patientService;

    @Autowired
    private MedicationService medicationService;

    @GetMapping("/patients")
    public ResponseEntity<List<PatientDTO>> getPatient(){
        return ResponseEntity.ok(patientService.getAllPatient());
    }

    @GetMapping("/medications")
    public ResponseEntity<List<MedicationDTO>> getMedications(){
        return ResponseEntity.ok(medicationService.getAllMedications());
    }
}
