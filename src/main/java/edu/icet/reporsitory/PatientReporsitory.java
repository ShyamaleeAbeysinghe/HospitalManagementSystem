package edu.icet.reporsitory;

import edu.icet.entity.PatientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientReporsitory extends JpaRepository<PatientEntity,Integer> {
}
