package com.sinensia.MyMovieApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;



@SpringBootApplication
@EnableCaching
public class MyMovieApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyMovieApiApplication.class, args);
	}

}
