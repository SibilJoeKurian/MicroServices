package com.example.movie_info_service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class MovieInfoServiceApplication {
	public static Logger logger= LoggerFactory.getLogger(MovieInfoServiceApplication.class);
	public static void main(String[] args) {
		logger.info("In spring application");
		SpringApplication.run(MovieInfoServiceApplication.class, args);
	}

}
