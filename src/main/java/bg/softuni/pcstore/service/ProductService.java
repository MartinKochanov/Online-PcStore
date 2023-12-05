package bg.softuni.pcstore.service;

import bg.softuni.pcstore.model.dto.NewProductDTO;
import jakarta.validation.Valid;
import org.springframework.web.multipart.MultipartFile;

public interface ProductService {

    void addNewProduct(@Valid NewProductDTO newProductDTO, String productName, MultipartFile file);
}
