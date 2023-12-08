package bg.softuni.pcstore.repository;

import bg.softuni.pcstore.model.dto.ProductDetailsDTO;
import bg.softuni.pcstore.model.entity.ProductEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
    Optional<ProductEntity> findByModel(String value);
    @Query("SELECT product FROM ProductEntity product WHERE CONCAT(product.typeProduct,' ',product.manufacturer,' ',product.model) LIKE %:keyword%")
    Page<ProductEntity> search(Pageable pageable, String keyword);

    void deleteByUuid(UUID uuid);

    Optional<ProductEntity> findByUuid(UUID uuid);
}
