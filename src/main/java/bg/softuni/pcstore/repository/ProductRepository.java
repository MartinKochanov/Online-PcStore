package bg.softuni.pcstore.repository;

import bg.softuni.pcstore.model.entity.ProductEntity;
import bg.softuni.pcstore.model.enums.ProductTypeEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
    Optional<ProductEntity> findByModel(String value);

    List<ProductEntity> findByTypeProduct(ProductTypeEnum type);
}
