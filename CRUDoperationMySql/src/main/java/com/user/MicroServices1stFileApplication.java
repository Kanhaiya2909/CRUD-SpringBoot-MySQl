package com.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MicroServices1stFileApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServices1stFileApplication.class, args);
	}
	
	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
