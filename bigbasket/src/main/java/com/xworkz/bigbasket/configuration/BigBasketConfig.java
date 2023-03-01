package com.xworkz.bigbasket.configuration;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.xworkz.bigbasket.service.BigBasketService;

@Configuration
@ComponentScan("com.xworkz.bigbasket")
public class BigBasketConfig {
	
	public BigBasketConfig(){
		System.out.println("created :" + this.getClass().getSimpleName());
	}
	
	@Bean
	public ViewResolver viewResolver() {
		System.out.println("running viewResolver");
		return new InternalResourceViewResolver("/",".jsp");
	}
	
	@Bean
	public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean() {
		System.out.println("running localContainerEntityManagerFactoryBean");
		LocalContainerEntityManagerFactoryBean bean=new LocalContainerEntityManagerFactoryBean();
		return bean;
	}

}
