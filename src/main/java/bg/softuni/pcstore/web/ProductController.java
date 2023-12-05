package bg.softuni.pcstore.web;


import bg.softuni.pcstore.exception.ObjectNotFoundException;
import bg.softuni.pcstore.model.dto.NewProductDTO;
import bg.softuni.pcstore.model.enums.*;
import bg.softuni.pcstore.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService adminService) {
        this.productService = adminService;
    }
    //@PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @GetMapping("/add-products")
    public ModelAndView addProduct() {
        return new ModelAndView("add-products");
    }
    //@PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @GetMapping(value = "/add-product/{product}")
    public ModelAndView addProduct(@PathVariable(name = "product") String product,
                                   @ModelAttribute("newProductDTO") NewProductDTO newProductDTO) {
        return getAddProductView(product);
    }
    //@PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @PostMapping(value = "/add-product/{product}", consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
    public ModelAndView addProduct(@PathVariable(name = "product") String product,
                                   @Valid @ModelAttribute("newProductDTO") NewProductDTO newProductDTO,
                                   BindingResult bindingResult,
                                   @RequestParam("image") MultipartFile image
    ) {

        if (bindingResult.hasErrors()) {
            return getAddProductView(product);
        }

        productService.addNewProduct(newProductDTO, product, image);


        return new ModelAndView("redirect:/");
    }


    private static ModelAndView getAddProductView(String product) {
        if (!ProductTypeEnum.contains(product)) {
            throw new ObjectNotFoundException("No suck product found!");
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


        return modelAndView;
    }

    //TODO: Make restock and menage the roles functionalities
}
