package bg.softuni.pcstore.repository;

import bg.softuni.pcstore.model.entity.SpecificationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecificationRepository extends JpaRepository<SpecificationEntity, Long> {
}
