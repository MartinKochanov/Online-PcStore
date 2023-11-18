package bg.softuni.pcstore.web;

import bg.softuni.pcstore.model.dto.UserRegisterDto;
import bg.softuni.pcstore.service.UserService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class UserRegisterController {

    private final UserService userService;


    public UserRegisterController(UserService userService) {
        this.userService = userService;


    }

    @GetMapping("/register")
    public ModelAndView register(@ModelAttribute("userRegisterDto") UserRegisterDto userRegisterDto) {
        return new ModelAndView("register");
    }


    @PostMapping("/register")
    public ModelAndView register(@ModelAttribute("userRegisterDto") @Valid UserRegisterDto userRegisterDto,
                                 BindingResult bindingResult, RedirectAttributes ra) {

        if (bindingResult.hasErrors()) {
            return new ModelAndView("register");
        }
        userService.register(userRegisterDto);
        ra.addFlashAttribute("message", "Successful registration! A verification email has been sent to your email address.");
        return new ModelAndView("redirect:/success-registration");
    }

    @GetMapping("/success-registration")
    public ModelAndView successRegistration() {
        return new ModelAndView("success-registration");
    }

    @GetMapping("/activation")
    public ModelAndView activateAccount(@RequestParam("token") String token) {
        ModelAndView modelAndView = new ModelAndView("/activation");
        boolean activated = userService.activateAccount(token);
        if (!activated) {
            modelAndView.addObject("invalidToken", false);
        }
        modelAndView.addObject("validToken", true);
        return modelAndView;
    }

}
