package com.sinensia.MyMovieApi.Controller;

import com.sinensia.MyMovieApi.Entity.Usuario;
import com.sinensia.MyMovieApi.Repository.UsuarioRepositorio;
import com.sinensia.MyMovieApi.Service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.HashMap;

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

	// By ID Movie
	@GetMapping("/movie/{id}")
	public Object findMovieByID(@AuthenticationPrincipal UserDetails userDetails, @PathVariable Long id) {
		System.out.println(id);
		String movieid = Long.toString(id);
		Usuario usuario = UsuarioRepositorio.findByUsername(userDetails.getUsername(), movieid).orElse(null);

		HashMap<String, Object> movie = movieService.getMovieById(id);
		if (usuario != null) {
			movie.put("favorite", usuario.getFavorite());
			movie.put("personal_rating", usuario.getPersonal_rating());
			movie.put("notes", usuario.getNotes());
		}
		return movie;
	}

	// genre
	@GetMapping("/genre/movie/list")
	public Object getAllGenres() {
		var x = movieService.getAllGenres();
		return x;
	}

	// popular movie
	@GetMapping("/movie/popular")
	public Object getPopularMovies() {
		var x = movieService.getPopularMovies();
		return x;
	}

	// Top Rated
	@GetMapping("/movie/top_rated")
	public Object getTopRated() {
		var x = movieService.getTopRated();
		return x;
	}

	// Credits
	@GetMapping("/movie/{id}/credits")
	public Object getCredits(@PathVariable int id) throws IOException {
		var x = movieService.getCredits(id);
		return x;
	}
	
	
	// Image
	@GetMapping("/movie/{id}/images")
	public Object getImage(@PathVariable Long id) throws IOException {
		var x = movieService.getImage(id);
		return x;
	}

	// Keywords
	@GetMapping("/movie/{id}/keywords")
	public Object getKeyWords(@PathVariable Long id) throws IOException {
		var x = movieService.getKeyWords(id);
		return x;
	}

	// Recommends
	@GetMapping("/movie/{id}/recommendations")
	public Object getRecommends(@PathVariable int id) throws IOException {
		var x = movieService.getRecommends(id);
		return x;
	}

	// Similar Movies
	@GetMapping("/movie/{id}/similar")
	public Object getSimilarMovies(@PathVariable Long id) throws IOException {
		var x = movieService.getSimilarMovies(id);
		return x;
	}

	@PatchMapping("/movie/{movieid}")
	public ResponseEntity<Usuario> patchUsuario(@PathVariable Long id, @RequestBody Usuario usuario,
			@AuthenticationPrincipal UserDetails userDetails) {
		String movieId = Long.toString(id);
		Usuario updateMovie = UsuarioRepositorio.findByUsername(userDetails.getUsername(), movieId).orElse(null);
		if (updateMovie == null) {
			updateMovie = new Usuario();
		}
		updateMovie.setUsername(userDetails.getUsername());
		updateMovie.setMovieId(movieId);
		updateMovie.setFavorite(usuario.getFavorite());
		updateMovie.setPersonal_rating(usuario.getPersonal_rating());
		updateMovie.setNotes(usuario.getNotes());

		usuarioRepositorio.save(updateMovie);

		return new ResponseEntity<Usuario>(updateMovie, HttpStatus.OK);

	}
}
