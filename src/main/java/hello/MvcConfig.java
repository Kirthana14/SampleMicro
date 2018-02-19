package hello;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@Configuration

public class MvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/").setViewName("home");
        registry.addViewController("/micro").setViewName("micro");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/about").setViewName("about");
        registry.addViewController("/micro1").setViewName("micro1");
        registry.addViewController("/micro2").setViewName("micro2");
        registry.addViewController("/micro3").setViewName("micro3");
	registry.addViewController("/micro4").setViewName("micro4");
        registry.addViewController("/micro5").setViewName("micro5");
	registry.addViewController("/micro6").setViewName("micro6");
    }

}
