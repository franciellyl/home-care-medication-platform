package spring.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HomeCareController {

    @GetMapping
    public ResponseEntity<String> getPatient(){
        return ResponseEntity.ok("Started"); //@TODO continuar daqui
    }
}
