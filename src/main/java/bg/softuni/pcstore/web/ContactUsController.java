package bg.softuni.pcstore.web;

import bg.softuni.pcstore.model.dto.ContactUsDto;
import bg.softuni.pcstore.service.EmailService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContactUsController {

    private final EmailService emailService;

    public ContactUsController(EmailService emailService) {
        this.emailService = emailService;
    }

    @GetMapping("/contact-us")
    public ModelAndView contactUs(@ModelAttribute("contactUsDto") ContactUsDto contactUsDto) {
        return new ModelAndView("contact-us");
    }

    @PostMapping("/contact-us")
    public ModelAndView contactUs(@Valid @ModelAttribute("contactUsDto") ContactUsDto contactUsDto,
                                  BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return new ModelAndView("contact-us");
        }

        emailService.sendContactUsEmail(contactUsDto.getEmail(), contactUsDto.getName(), contactUsDto.getText());
        return new ModelAndView("redirect:/");
    }
}
