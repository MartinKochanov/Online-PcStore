package bg.softuni.pcstore.web;

import bg.softuni.pcstore.model.dto.NewProductDTO;
import bg.softuni.pcstore.model.enums.CaseTypeEnum;
import bg.softuni.pcstore.model.enums.FormatEnum;
import bg.softuni.pcstore.model.enums.ManufacturerEnum;
import bg.softuni.pcstore.model.enums.ProductTypeEnum;
import bg.softuni.pcstore.service.AdminService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin")
public class AdminController {

    private final AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @GetMapping("/add-product")
    public ModelAndView addProduct(@ModelAttribute("newProductDTO") NewProductDTO newProductDTO) {
        return getAddProductView();
    }


    @PostMapping("/add-product")
    public ModelAndView addProduct(@Valid @ModelAttribute("newProductDTO") NewProductDTO newProductDTO,
                                   BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            ModelAndView addProductView = getAddProductView();
            addProductView.addObject("badCredentials", true);
            return addProductView;
        }
        adminService.addNewProduct(newProductDTO);

        return new ModelAndView("redirect:/");
    }


    private static ModelAndView getAddProductView() {
        ModelAndView modelAndView = new ModelAndView("add-product");
        modelAndView.addObject("productTypes", ProductTypeEnum.values());
        modelAndView.addObject("manufacturers", ManufacturerEnum.values());
        modelAndView.addObject("caseTypes", CaseTypeEnum.values());
        modelAndView.addObject("caseFormats", FormatEnum.values());
        return modelAndView;
    }

    //TODO: Make restock and menage the roles functionalities
}
