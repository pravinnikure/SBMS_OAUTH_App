package com.app.pravin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbmsRestSecurityOAuth2Application {

	public static void main(String[] args) {
		SpringApplication.run(SbmsRestSecurityOAuth2Application.class, args);
		
		System.out.println("Spring boot application for Spring OAuth2.X");
	}

}
