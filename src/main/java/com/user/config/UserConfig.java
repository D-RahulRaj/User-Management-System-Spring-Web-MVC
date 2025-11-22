package com.user.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = "com.user")
public class UserConfig {
	
	public UserConfig()
	{
		System.out.println("Config Class");
	}
	
	@Bean
	public InternalResourceViewResolver internalResourceViewResolverBean() {
		return new InternalResourceViewResolver("/",".jsp");
	}
}
