package com.example.movie_catlog_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MovieCatlogServiceApplication {
@Bean
public RestTemplate restTemplate(){
	return new RestTemplate();
}
	public static void main(String[] args) {

		System.out.println("HELLLLPPPPPP");
		SpringApplication.run(MovieCatlogServiceApplication.class, args);
	}

}
