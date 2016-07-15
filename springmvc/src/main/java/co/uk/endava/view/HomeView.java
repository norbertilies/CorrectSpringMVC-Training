package co.uk.endava.view;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Created by nilies on 7/14/2016.
 */
@Configuration
@ComponentScan(basePackages = "co.uk.endava.controller")
@EnableWebMvc
public class HomeView {
    @Bean
    public InternalResourceViewResolver getViewResolver()
    {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/jsp/");
        resolver.setSuffix(".jsp");
        return resolver;
    }
}
