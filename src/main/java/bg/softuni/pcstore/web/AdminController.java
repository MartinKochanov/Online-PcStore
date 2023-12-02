package bg.softuni.pcstore.web;


import bg.softuni.pcstore.model.dto.NewProductDTO;
import bg.softuni.pcstore.model.enums.*;
import bg.softuni.pcstore.service.AdminService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin")
public class AdminController {

    private final AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @GetMapping("/add-products")
    public ModelAndView addProduct() {
        return new ModelAndView("add-products");
    }

    @GetMapping("/add-product/{product}")
    public ModelAndView addProduct(@PathVariable(name = "product") String product,
                                   @ModelAttribute("newProductDTO") NewProductDTO newProductDTO) {
        return getAddProductView(product);
    }


    @PostMapping("/add-product/{product}")
    public ModelAndView addProduct(@PathVariable(name = "product") String product,
                                   @Valid @ModelAttribute("newProductDTO") NewProductDTO newProductDTO,
                                   BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return getAddProductView(product);
        }

        adminService.addNewProduct(newProductDTO, product);


        return new ModelAndView("redirect:/");
    }


    private static ModelAndView getAddProductView(String product) {
        ModelAndView modelAndView = new ModelAndView("add-product");
        modelAndView.addObject("product", product);
        modelAndView.addObject("productTypes", ProductTypeEnum.values());
        modelAndView.addObject("manufacturers", ManufacturerEnum.values());
        modelAndView.addObject("caseTypes", CaseTypeEnum.values());
        modelAndView.addObject("caseFormats", FormatEnum.values());
        modelAndView.addObject("cpuSockets", CpuSocketTypesEnum.values());
        modelAndView.addObject("memoryTypes", TypeMemoryEnum.values());
        modelAndView.addObject("graphicCardTypes", GraphicCardSlotsEnum.values());



        return modelAndView;
    }

    //TODO: Make restock and menage the roles functionalities
}
