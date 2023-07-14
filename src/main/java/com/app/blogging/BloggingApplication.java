package com.app.blogging;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EntityScan(basePackages = {"com.app.blogging"})
@OpenAPIDefinition(info = @Info
		(title = "Blogging app backend using Spring Boot",
				description = "API Endpoints for Blogging App",
				contact = @Contact(name = "Kritika Sinha", email = "kritikasinha798@gmail.com")))

public class BloggingApplication {

	public static void main(String[] args) {

		SpringApplication.run(BloggingApplication.class, args);
	}

	@Bean
	public ModelMapper modelMapper(){

		return new ModelMapper();
	}

}
