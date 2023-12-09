package bg.softuni.pcstore.config;

import bg.softuni.pcstore.service.interceptors.LoginPageInterceptor;
import bg.softuni.pcstore.service.interceptors.RegisterPageInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class LoginRegisterRedirectMvcConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginPageInterceptor());
        registry.addInterceptor(new RegisterPageInterceptor());
    }
}
