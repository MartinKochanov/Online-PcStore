package bg.softuni.pcstore.web;

import bg.softuni.pcstore.repository.ProductRepository;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    private final ProductRepository productRepository;

    public HomeController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    @GetMapping(value = "/",produces = MediaType.IMAGE_JPEG_VALUE)
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("products", productRepository.findAll());
        return modelAndView;
    }


}
