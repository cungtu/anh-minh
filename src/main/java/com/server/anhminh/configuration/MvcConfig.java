package com.server.anhminh.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/home").setViewName("index");
		registry.addViewController("/shop").setViewName("shop");
		registry.addViewController("/detail").setViewName("detail");
		registry.addViewController("/cart").setViewName("cart");
		registry.addViewController("/checkout").setViewName("checkout");
		registry.addViewController("/contact").setViewName("contact");
	}

}
