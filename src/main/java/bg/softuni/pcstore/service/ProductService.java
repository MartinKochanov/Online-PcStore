package bg.softuni.pcstore.service;

import bg.softuni.pcstore.model.dto.NewProductDTO;
import bg.softuni.pcstore.model.dto.ProductDetailsDTO;
import bg.softuni.pcstore.model.dto.ProductShortSummaryDTO;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.UUID;

public interface ProductService {

    void addNewProduct(@Valid NewProductDTO newProductDTO, String productName);

    Page<ProductShortSummaryDTO> allProducts(Pageable pageable, String keyword);

    void deleteProduct(UUID uuid);


    ProductDetailsDTO getProductDetails(UUID uuid);
}
