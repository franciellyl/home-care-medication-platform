package spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.dto.PatientResponseDTO;
import spring.entity.PatientEntity;
import spring.service.PatientService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HomeCareController {
    @Autowired
    private PatientService patientService;

    @GetMapping("/patients")
    public ResponseEntity<List<PatientEntity>> getPatient(){
        return ResponseEntity.ok(patientService.getAllPatient());
    }
}
