package com.tool.toolservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@SpringBootApplication
public class ToolServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ToolServiceApplication.class, args);
		System.out.println("Spring boot app is running tada --> ");
	}


	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}

}
