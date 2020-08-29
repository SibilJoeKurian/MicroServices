package com.example.movie_info_service;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MovieInfoServiceApplicationTests {
public static Logger logger1= LoggerFactory.getLogger(MovieInfoServiceApplicationTests.class);
	@Test
	void contextLoads() {
		logger1.info("Test started");
	}
}
