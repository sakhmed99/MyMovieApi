package com.sinensia.MyMovieApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.gemfire.cache.config.EnableGemfireCaching;
import org.springframework.data.gemfire.config.annotation.ClientCacheApplication;
import org.springframework.data.gemfire.repository.config.EnableGemfireRepositories;



@SpringBootApplication
@EnableCaching
@ClientCacheApplication(name = "MyMovieApiApplication")
@EnableGemfireCaching
@EnableGemfireRepositories
public class MyMovieApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyMovieApiApplication.class, args);
	}

}
