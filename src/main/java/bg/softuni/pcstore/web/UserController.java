package bg.softuni.pcstore.web;

import bg.softuni.pcstore.model.dto.UserRegisterDto;
import bg.softuni.pcstore.service.UserService;
import jakarta.validation.Valid;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.data.web.PageableDefault;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class UserController {

    private final UserService userService;


    public UserController(UserService userService) {
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
        return new ModelAndView("/success-registration");
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

    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @GetMapping("/admin/menage-users")
    public ModelAndView changeRole(@PageableDefault(size = 3, sort = "id") Pageable pageable,
                                   @Param("keyword") String keyword) {
        ModelAndView modelAndView = new ModelAndView("menage-users");

        modelAndView.addObject("users", userService.getAllUsers(pageable, keyword));
        modelAndView.addObject("currentPage", pageable.getPageNumber());


        return modelAndView;
    }
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @DeleteMapping("/admin/delete-user/{username}")
    public ModelAndView deleteUser(@PathVariable("username") String username) {
        userService.deleteUser(username);
        return new ModelAndView("redirect:/admin/menage-users");
    }
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @PatchMapping("/admin/update-user/{username}")
    public ModelAndView updateUser(@PathVariable("username") String username) {
        userService.makeAdmin(username);
        return new ModelAndView("redirect:/admin/menage-users");
    }


}
