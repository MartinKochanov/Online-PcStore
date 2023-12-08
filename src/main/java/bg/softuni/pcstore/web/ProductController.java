package bg.softuni.pcstore.web;


import bg.softuni.pcstore.exception.ObjectNotFoundException;
import bg.softuni.pcstore.model.dto.NewProductDTO;
import bg.softuni.pcstore.model.enums.*;
import bg.softuni.pcstore.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.MediaType;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.UUID;

@Controller
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService adminService) {
        this.productService = adminService;
    }

    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @GetMapping("/admin/add-products")
    public ModelAndView addProduct() {
        return new ModelAndView("add-products");
    }

    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @GetMapping(value = "/admin/add-product/{product}")
    public ModelAndView addProduct(@PathVariable(name = "product") String product,
                                   @ModelAttribute("newProductDTO") NewProductDTO newProductDTO) {
        return getAddProductView(product);
    }

    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @PostMapping(value = "/admin/add-product/{product}", consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
    public ModelAndView addProduct(@PathVariable(name = "product") String product,
                                   @Valid @ModelAttribute("newProductDTO") NewProductDTO newProductDTO,
                                   BindingResult bindingResult
    ) {
        if (bindingResult.hasErrors()) {
            return getAddProductView(product);
        }
        productService.addNewProduct(newProductDTO, product);
        return new ModelAndView("redirect:/");
    }

    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @DeleteMapping("/admin/delete-product/{uuid}")
    public ModelAndView deleteProduct(@PathVariable("uuid") UUID uuid) {
        productService.deleteProduct(uuid);
        return new ModelAndView("redirect:/admin/menage-products");
    }


    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @GetMapping("/admin/menage-products")
    public ModelAndView menageProducts(@PageableDefault(size = 3, sort = "uuid") Pageable pageable,
                                       @Param("keyword") String keyword) {
        ModelAndView modelAndView = new ModelAndView("menage-products");
        modelAndView.addObject("products", productService.allProducts(pageable, keyword));
        modelAndView.addObject("currentPage", pageable.getPageNumber());

        return modelAndView;
    }

    @GetMapping("/products/search/{product}")
    public ModelAndView search(@PageableDefault(size = 8, sort = "uuid") Pageable pageable,
                               @PathVariable("product") String keyword) {
        ModelAndView modelAndView = new ModelAndView("all-products");
        modelAndView.addObject("products", productService.allProducts(pageable, keyword));
        modelAndView.addObject("currentPage", pageable.getPageNumber());
        productService.allProducts(pageable, keyword);

        return modelAndView;
    }

    @GetMapping("/products/search-product")
    public ModelAndView searchCertainProduct(@PageableDefault(size = 8, sort = "uuid") Pageable pageable,
                               @Param("product") String keyword) {
        ModelAndView modelAndView = new ModelAndView("all-products");
        modelAndView.addObject("products", productService.allProducts(pageable, keyword));
        modelAndView.addObject("currentPage", pageable.getPageNumber());
        productService.allProducts(pageable, keyword);

        return modelAndView;
    }

    @GetMapping("/products/details/{uuid}")
    public ModelAndView productDetails(@PathVariable("uuid") UUID uuid) {
        ModelAndView modelAndView = new ModelAndView("product-details");
        modelAndView.addObject("product", productService.getProductDetails(uuid));
        return modelAndView;
    }

    private static ModelAndView getAddProductView(String product) {
        if (!ProductTypeEnum.containsIgnoreCase(product)) {
            throw new ObjectNotFoundException("No such product found!");
        }
        ModelAndView modelAndView = new ModelAndView("add-product");
        modelAndView.addObject("product", product);
        modelAndView.addObject("manufacturers", ManufacturerEnum.values());
        modelAndView.addObject("caseTypes", CaseTypeEnum.values());
        modelAndView.addObject("caseFormats", FormatEnum.values());
        modelAndView.addObject("cpuSockets", CpuSocketTypesEnum.values());
        modelAndView.addObject("memoryTypes", TypeMemoryEnum.values());
        modelAndView.addObject("graphicCardTypes", GraphicCardSlotsEnum.values());
        modelAndView.addObject("resolutions", ResolutionsEnum.values());
        modelAndView.addObject("coolingTypes", CoolerTypesEnum.values());
        modelAndView.addObject("driveInterfaces", DrivesInterfacesEnum.values());
        modelAndView.addObject("ssdTypes", SsdTypesEnum.values());
        modelAndView.addObject("colors", ColorEnum.values());
        modelAndView.addObject("connectivity", ConnectivityEnum.values());
        modelAndView.addObject("videoMemoryTypes", VideoMemoryTypeEnum.values());


        return modelAndView;
    }
}
