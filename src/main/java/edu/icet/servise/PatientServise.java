package edu.icet.servise;

import edu.icet.model.Patient;

import java.util.List;

public interface PatientServise {
    public List<Patient> getPatient();

    void addPatient(Patient patient);

    void deleteById(Integer id);
}
