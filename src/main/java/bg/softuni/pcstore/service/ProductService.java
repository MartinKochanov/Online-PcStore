package bg.softuni.pcstore.service;

import bg.softuni.pcstore.model.dto.NewProductDTO;
import bg.softuni.pcstore.model.dto.ProductShortSummaryDto;
import bg.softuni.pcstore.model.entity.ProductEntity;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.UUID;

public interface ProductService {

    void addNewProduct(@Valid NewProductDTO newProductDTO, String productName);

    Page<ProductShortSummaryDto> allProducts(Pageable pageable);

    void deleteProduct(UUID uuid);


}
