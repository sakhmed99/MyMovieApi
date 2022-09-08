package com.sinensia.MyMovieApi.Service;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.HashMap;



@Service
public class MovieService {

	@Value("${themoviedb.api_key}")
	private String api_key;
	
	WebClient webClient = WebClient.create("https://api.themoviedb.org/3/");
	
	
	//get initial config//
	public HashMap<String, Object> getConfig() {
		HashMap<String, Object> x = webClient.get().uri(uriBuilder -> uriBuilder.path("configuration")
				.queryParam("api_key", "d237d6a6dfa404e1bf1593bf854cfa36").build()).retrieve().bodyToMono(HashMap.class).block();
			
		return x;
	}
	
	//genres//
	public HashMap<String, Object> getAllGenres() {
		return webClient.get().uri(uriBuilder -> uriBuilder.path("genre/movie/list").queryParam("api_key", api_key).build()).retrieve()
				.bodyToMono(HashMap.class).block();
		
	}
	
	//Get Popular Movies//
	
	public HashMap<String, Object> getPopularMovies() {
		return webClient.get()
				.uri(uriBuilder -> uriBuilder.path("movie/popular").queryParam("api_key", api_key).build()).retrieve().bodyToMono(HashMap.class).block();
	}
	
	
	//get movie by id//
	public HashMap<String, Object> getMovieById(Long id) {
		HashMap<String, Object> x = webClient.get().uri(uriBuilder -> uriBuilder.path("/movie/{movieid}").queryParam("api_key", api_key).build(id)).retrieve()
				.bodyToMono(HashMap.class).block();
		
		return x;
	}
	
	//get Top Rated Movies//
	public HashMap<String, Object> getTopRated() {
		return webClient.get()
				.uri(uriBuilder -> uriBuilder.path("movie/top_rated").queryParam("api_key", api_key).build())
				.retrieve().bodyToMono(HashMap.class).block();
	}
	
	//Get Credits//
	
	public HashMap<String, Object> getCredits(int id) {
		HashMap<String, Object> x = webClient.get().uri(uriBuilder -> uriBuilder.path("movie/{id}/credits").queryParam("api_key", api_key).build(id)).retrieve()
				.bodyToMono(HashMap.class).block();
		
		return x;
	}
	
	//Get images//
	public HashMap<String, Object> getImage(Long id) {
		HashMap<String, Object> x = webClient.get().uri(uriBuilder -> uriBuilder.path("/movie/{movieid}/images").queryParam("api_key", api_key).build(id)).retrieve()
				.bodyToMono(HashMap.class).block();
		
		return x;
	}
	
	//get KeyWords//
	public HashMap<String, Object> getKeyWords(Long id) {
		HashMap<String, Object> x = webClient.get().uri(uriBuilder -> uriBuilder.path("/movie/{movieid}/keywords").queryParam("api_key", api_key).build(id)).retrieve()
				.bodyToMono(HashMap.class).block();
		
		return x;
	}
	
	//Get Recommendations//
	public HashMap<String, Object> getRecommends(int id) {
		HashMap<String, Object> x = webClient.get().uri(uriBuilder -> uriBuilder.path("/movie/{id}/recommendations").queryParam("api_key", api_key).build(id)).retrieve()
				.bodyToMono(HashMap.class).block();
		
		return x;
	}
	
	//Get Similar Movies
	public HashMap<String, Object> getSimilarMovies(Long id) {
		HashMap<String, Object> x = webClient.get().uri(uriBuilder -> uriBuilder.path("/movie/{id}/similar").queryParam("api_key", api_key).build(id)).retrieve()
				.bodyToMono(HashMap.class).block();
		
		return x;
	}
	

}
