package com.sbcogrs.sbcogrs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;

@SpringBootApplication
@EnableMethodSecurity
public class SbcogrsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbcogrsApplication.class, args);
	}

}
