package com.jwt.jwtimplementationspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class JwtImplementationSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtImplementationSpringBootApplication.class, args);
	}

}
