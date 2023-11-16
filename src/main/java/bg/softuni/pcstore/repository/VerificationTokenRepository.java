package bg.softuni.pcstore.repository;

import bg.softuni.pcstore.model.entity.UserEntity;
import bg.softuni.pcstore.model.entity.VerificationToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VerificationTokenRepository extends JpaRepository<VerificationToken, Long> {
    VerificationToken findByToken(String token);

    VerificationToken findByUser(UserEntity user);
}
