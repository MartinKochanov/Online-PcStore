package bg.softuni.pcstore.service;

import bg.softuni.pcstore.model.dto.NewProductDTO;
import jakarta.validation.Valid;

public interface AdminService {

    void addNewProduct(@Valid NewProductDTO newProductDTO);
}
