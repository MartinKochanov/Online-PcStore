package bg.softuni.pcstore.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserLoginController {
    @GetMapping("/login")
    public ModelAndView login() {
        return new ModelAndView("login");
    }

    @PostMapping("/login-error")
    public ModelAndView failLogin(@ModelAttribute("email") String email ) {
        ModelAndView modelAndView = new ModelAndView("/login");

        modelAndView.addObject("badCredentials", true);
        return modelAndView;
    }
}
