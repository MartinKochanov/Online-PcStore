package bg.softuni.pcstore.web;

import bg.softuni.pcstore.model.dto.UserRegisterDto;
import bg.softuni.pcstore.model.entity.UserEntity;
import bg.softuni.pcstore.model.entity.VerificationToken;
import bg.softuni.pcstore.repository.UserRepository;
import bg.softuni.pcstore.repository.VerificationTokenRepository;
import bg.softuni.pcstore.service.UserService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class UserRegisterController {

    private final UserService userService;
    private final VerificationTokenRepository verificationTokenRepository;
    private final UserRepository userRepository;

    public UserRegisterController(UserService userService, VerificationTokenRepository verificationTokenRepository, UserRepository userRepository) {
        this.userService = userService;
        this.verificationTokenRepository = verificationTokenRepository;
        this.userRepository = userRepository;
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

    @GetMapping("/activate")
    public ModelAndView activateAcc(@RequestParam("token") String token) {
        ModelAndView modelAndView = new ModelAndView("activation");
        if (token == null) {
            modelAndView.addObject("invalidToken", true);
            return modelAndView;
        }
        VerificationToken verificationToken = verificationTokenRepository.findByToken(token);
        if (verificationToken == null || token.isEmpty()) {
            modelAndView.addObject("invalidToken", true);
            return modelAndView;
        }
        UserEntity user = verificationToken.getUser();
        user.setDisabled(false);
        userRepository.save(user);
        modelAndView.addObject("invalidToken", false);
        return modelAndView;
    }

}
