package edu.icet.controller;

import edu.icet.model.Patient;
import edu.icet.servise.PatientServise;
import edu.icet.servise.PatientServiseImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class PatientController {

    @Autowired
    PatientServise servise;

    @GetMapping("/get-all")
    public List<Patient> getPatient(){
        return servise.getPatient();
    }

    @PostMapping("/add-patient")
    public void addPatient(@RequestBody Patient patient){
        servise.addPatient(patient);
    }

    @DeleteMapping("/delete-by-id/{id}")

    public void deleteById(@PathVariable Integer id){
        servise.deleteById(id);
    }
}
