package com.sinensia.MyMovieApi.Controller;


import java.io.IOException;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sinensia.MyMovieApi.Repository.UsuarioRepositorio;
import com.sinensia.MyMovieApi.Service.MovieService;

@RestController
@RequestMapping("/api")

public class MovieController {

	@Autowired
	MovieService movieService;
	
	@Autowired
	UsuarioRepositorio usuarioRepositorio;
	
	//Config
	@GetMapping("/configuration")
	public Object getConfiguration() {
		var x = movieService.getConfig();
		return x;
	}
	
	//By ID Movie
	@GetMapping("/movie/{movieid}")
	public  HashMap<String,Object>  getMovieById(@PathVariable Long id) throws IOException{
		return movieService.getMovieById(id);
	}
	
	//genre 
	@GetMapping("/genre/movie/list")
	public Object getAllGenres() {
		var x = movieService.getAllGenres();
		return x;
	}
	
	//popular movie
	@GetMapping("/movie/popular")
	public Object getPopularMovies() {
		var x = movieService.getPopularMovies();
		return x;
	}
	
	//Top Rated
	@GetMapping("/movie/top_rated")
	public Object getTopRated() {
		var x = movieService.getTopRated();
		return x;
	}
	
	//Credits
	@GetMapping("/movie/{movieid}/credits")
	public Object getCredits(@PathVariable Long id) throws IOException {
		var x = movieService.getCredits(id);
		return x;
	}
	
	//Image
	@GetMapping("/movie/{movieid}/images")
	public Object getImage(@PathVariable Long id) throws IOException {
		var x = movieService.getImage(id);
		return x;
	}
	
	//Keywords
	@GetMapping("/movie/{movieid}/keywords")
	public Object getKeyWords(@PathVariable Long id) throws IOException {
		var x = movieService.getKeyWords(id);
		return x;
	}
	
	//Recommends
	@GetMapping("/movie/{movieid}/recommendations")
	public Object getRecommends(@PathVariable Long id) throws IOException {
		var x = movieService.getRecommends(id);
		return x;
	}
	
	//Similar Movies
	@GetMapping("/movie/{movieid}/similar")
	public Object getSimilarMovies(@PathVariable Long id) throws IOException {
		var x = movieService.getSimilarMovies(id);
		return x;
	}


	
		
}

	

