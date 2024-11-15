package spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.entity.PatientEntity;

//@org.springframework.stereotype.Repository
public interface PatientRepository extends JpaRepository<PatientEntity, Long> {
}
