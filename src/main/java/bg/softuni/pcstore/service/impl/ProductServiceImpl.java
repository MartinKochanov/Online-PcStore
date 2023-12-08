package bg.softuni.pcstore.service.impl;

import bg.softuni.pcstore.exception.ObjectNotFoundException;
import bg.softuni.pcstore.model.dto.NewProductDTO;
import bg.softuni.pcstore.model.dto.ProductDetailsDTO;
import bg.softuni.pcstore.model.dto.ProductShortSummaryDTO;
import bg.softuni.pcstore.model.dto.SpecificationSummaryDTO;
import bg.softuni.pcstore.model.entity.ProductEntity;
import bg.softuni.pcstore.model.entity.SpecificationEntity;
import bg.softuni.pcstore.model.enums.ProductTypeEnum;
import bg.softuni.pcstore.repository.ProductRepository;
import bg.softuni.pcstore.repository.SpecificationRepository;
import bg.softuni.pcstore.service.ProductService;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.UUID;


@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    private final SpecificationRepository specificationRepository;

    private final ModelMapper modelMapper;

    public ProductServiceImpl(ProductRepository productRepository, SpecificationRepository specificationRepository, ModelMapper modelMapper) {
        this.productRepository = productRepository;
        this.specificationRepository = specificationRepository;
        this.modelMapper = modelMapper;
    }

    @Transactional
    @Override
    public void addNewProduct(@Valid NewProductDTO newProductDTO, String productName) {


        ProductEntity product = map(newProductDTO, productName);

        try {
            product.setImage(newProductDTO.getImage().getBytes());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        SpecificationEntity specification = modelMapper.map(newProductDTO, SpecificationEntity.class);
        specificationRepository.save(specification);
        product.setSpecifications(specification);
        productRepository.save(product);
    }

    @Override
    public Page<ProductShortSummaryDTO> allProducts(Pageable pageable, String keyword) {

        if (keyword != null && !keyword.isBlank() && !keyword.equals("all")) {
            return productRepository.search(pageable, keyword)
                    .map(ProductServiceImpl::mapAsShortSummary);
        }
        return productRepository
                .findAll(pageable)
                .map(ProductServiceImpl::mapAsShortSummary);
    }

    @Override
    @Transactional
    public void deleteProduct(UUID uuid) {
        productRepository.deleteByUuid(uuid);
    }

    @Override
    public ProductDetailsDTO getProductDetails(UUID uuid) {
        if (productRepository.findByUuid(uuid).isEmpty()) {
            throw new ObjectNotFoundException("Not found!");
        }
        return mapToDetailsDTO(productRepository.findByUuid(uuid).get());
    }

    private ProductDetailsDTO mapToDetailsDTO(ProductEntity product) {
        SpecificationSummaryDTO specificationSummaryDTO = modelMapper.map(product.getSpecifications(), SpecificationSummaryDTO.class);
        return new ProductDetailsDTO()
                .setManufacturer(product.getManufacturer())
                .setDescription(product.getDescription())
                .setModel(product.getModel())
                .setPrice(product.getPrice())
                .setImage(product.getImage())
                .setUuid(product.getUuid())
                .setSpecifications(specificationSummaryDTO);
    }

    private static ProductEntity map(NewProductDTO newProductDTO, String productName) {
        return new ProductEntity()
                .setTypeProduct(ProductTypeEnum.valueOf(productName))
                .setManufacturer(newProductDTO.getManufacturer())
                .setModel(newProductDTO.getModel())
                .setDescription(newProductDTO.getDescription())
                .setPrice(newProductDTO.getPrice())
                .setUuid(UUID.randomUUID());
    }
    private static ProductShortSummaryDTO mapAsShortSummary(ProductEntity productEntity) {
        return new ProductShortSummaryDTO()
                .setImage(productEntity.getImage())
                .setManufacturer(productEntity.getManufacturer())
                .setModel(productEntity.getModel())
                .setPrice(productEntity.getPrice())
                .setUuid(productEntity.getUuid())
                .setUuid(productEntity.getUuid());
    }
}
