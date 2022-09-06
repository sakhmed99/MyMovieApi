package com.sinensia.MyMovieApi.Controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sinensia.MyMovieApi.Entity.BackPostersEntity;
import com.sinensia.MyMovieApi.Entity.CreditsEntity;
import com.sinensia.MyMovieApi.Entity.GenresEntity;
import com.sinensia.MyMovieApi.Entity.KeywordsEntity;
import com.sinensia.MyMovieApi.Entity.MovieEntity;
import com.sinensia.MyMovieApi.Service.MovieService;

@RestController

public class MovieController {
	
	@Autowired
	MovieService movieService;
	
	
	//getAllGenres
	@GetMapping("api/genre/movie/list")
    public List<GenresEntity> getAllGenres() throws IOException {
		return movieService.getAllGenres();
    }
	
	
	//getAllPopularMovies
    @GetMapping("api/movie/popular")
    public List<MovieEntity> getPopularMovies() throws IOException {
        return movieService.getAllPopularMovies();
    }
    
    
    //getTopRatedMovies
    @GetMapping("api/movie/top_rated")
    public List<MovieEntity> getTopRatedMovies() throws IOException {
        return movieService.getTopRatedMovies();
    }
    
    
    //getMoviesById
    @GetMapping("api/movie/{movie_id}")
    public MovieEntity getMoviesById(@PathVariable Integer movie_id) throws IOException {
        return movieService.getMoviesById(movie_id);
    }
    
    
    //getCreditMovieById
    @GetMapping("api/movie/{movie_id}/credits")
    public CreditsEntity getCastAndCrewMovieById(@PathVariable Integer movie_id) throws IOException {
        return movieService.getCreditMovieById(movie_id);
    }
    
    
    //getImageMovieById
    @GetMapping("api/movie/{movie_id}/images")
    public BackPostersEntity getImagesForMovieById(@PathVariable Integer movie_id) throws IOException {
        return movieService.getImageMovieById(movie_id);
    }
    
    
    //getKeywordsMovieById
    @GetMapping("api/movie/{movie_id}/keywords")
    public List<KeywordsEntity> getKeywordsForMovieById(@PathVariable Integer movie_id) throws IOException {
        return movieService.getKeywordsMovieById(movie_id);
    }
    
    
    //getRecommendationsById
    @GetMapping("api/movie/{movie_id}/recommendations")
    public List<MovieEntity> getRecommendationsForMovieById(@PathVariable Integer movie_id) throws IOException {
        return movieService.getRecommendationsById(movie_id);
    }
    
    
    //getSimilarMoviesById
    @GetMapping("api/movie/{movie_id}/similar")
    public List<MovieEntity> getSimilarMovieById(@PathVariable Integer movie_id) throws IOException {
        return movieService.getSimilarMoviesById(movie_id);
        
    
    }
    
}