package spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.entity.MedicationEntity;

public interface MedicationRepository extends JpaRepository<MedicationEntity, Long> {
}
