package edu.icet.servise;

import edu.icet.entity.PatientEntity;
import edu.icet.model.Patient;
import edu.icet.reporsitory.PatientReporsitory;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientServiseImpl implements PatientServise{

    final PatientReporsitory reporsitory;
    final ModelMapper mapper;

    List<Patient> patientList=new ArrayList<>();

    @Override
    public List<Patient> getPatient() {
        List<Patient> patients=new ArrayList<>();
        reporsitory.findAll().forEach(patient->{
           patients.add(mapper.map(patient,Patient.class));

        });

        return patients;
    }

    @Override
    public void addPatient(Patient patient) {

        reporsitory.save(mapper.map(patient, PatientEntity.class));
    }

    @Override
    public void deleteById(Integer id) {
        reporsitory.deleteById(id);
    }
}
