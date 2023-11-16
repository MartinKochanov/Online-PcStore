package bg.softuni.pcstore.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin")
public class AdminController {


    @GetMapping("add-product")
    public ModelAndView addProduct() {
        return new ModelAndView("add-product");
    }
}
