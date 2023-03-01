package com.xworkz.satellite.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.satellite")
public class SatelliteConfig {
	
	public SatelliteConfig() {
		System.out.println("created :" + this.getClass().getSimpleName());
	}
	
	@Bean
	public ViewResolver resolver() {
		System.out.println("running resolver");
		return new InternalResourceViewResolver("/",".jsp");
	}
	
	@Bean
	public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean() {
		System.out.println("running localContainerEntityManagerFactoryBean");
		LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
		return bean;
	}

}
