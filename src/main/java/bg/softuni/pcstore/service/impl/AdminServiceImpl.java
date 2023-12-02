package bg.softuni.pcstore.service.impl;

import bg.softuni.pcstore.model.dto.NewProductDTO;
import bg.softuni.pcstore.model.entity.ProductEntity;
import bg.softuni.pcstore.model.entity.SpecificationEntity;
import bg.softuni.pcstore.model.enums.ProductTypeEnum;
import bg.softuni.pcstore.repository.ProductRepository;
import bg.softuni.pcstore.repository.SpecificationRepository;
import bg.softuni.pcstore.service.AdminService;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    private final ProductRepository productRepository;

    private final SpecificationRepository specificationRepository;

    private final ModelMapper modelMapper;

    public AdminServiceImpl(ProductRepository productRepository, SpecificationRepository specificationRepository, ModelMapper modelMapper) {
        this.productRepository = productRepository;
        this.specificationRepository = specificationRepository;
        this.modelMapper = modelMapper;
    }

    @Transactional
    @Override
    public void addNewProduct(@Valid NewProductDTO newProductDTO, String productName) {
        ProductEntity product = modelMapper.map(newProductDTO, ProductEntity.class);
        product.setTypeProduct(ProductTypeEnum.valueOf(productName));
        SpecificationEntity specification = modelMapper.map(newProductDTO, SpecificationEntity.class);
        specificationRepository.save(specification);
        product.setSpecifications(specification);
        productRepository.save(product);
    }
}
