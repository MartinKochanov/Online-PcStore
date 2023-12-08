package bg.softuni.pcstore.repository;

import bg.softuni.pcstore.model.dto.UserShortSummaryDTO;
import bg.softuni.pcstore.model.entity.UserEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findByEmail(String email);

    Optional<UserEntity> findByUsername(String username);

    @Query("SELECT user FROM UserEntity user WHERE CONCAT(user.firstName,' ',user.lastName,' ',user.username) LIKE %:keyword%")
    Page<UserEntity> search(Pageable pageable, String keyword);

    void deleteByUsername(String username);

    @Query("SELECT user FROM UserEntity user where user.role.roleName not like 'ADMIN' ")
    Page<UserEntity> findAllUsers(Pageable pageable);

}
