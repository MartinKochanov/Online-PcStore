package bg.softuni.pcstore.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

public class HomeController {
    @GetMapping("/")
    public ModelAndView index(){
        return new ModelAndView("index");
    }
}
