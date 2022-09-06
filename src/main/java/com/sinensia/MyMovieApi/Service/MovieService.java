package com.sinensia.MyMovieApi.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sinensia.MyMovieApi.Entity.BackPostersEntity;
import com.sinensia.MyMovieApi.Entity.CastEntity;
import com.sinensia.MyMovieApi.Entity.CreditsEntity;
import com.sinensia.MyMovieApi.Entity.CrewEntity;
import com.sinensia.MyMovieApi.Entity.GenresEntity;
import com.sinensia.MyMovieApi.Entity.ImagesEntity;
import com.sinensia.MyMovieApi.Entity.KeywordsEntity;
import com.sinensia.MyMovieApi.Entity.MovieEntity;
import com.sinensia.MyMovieApi.Entity.PopularMoviesEntity;
import com.sinensia.MyMovieApi.Entity.TopRatedMoviesEntity;

@Service
public class MovieService {
	
	final String link = "https://api.themoviedb.org/3/";
	
	final String apiKey = "d237d6a6dfa404e1bf1593bf854cfa36";
	
	private ObjectMapper mapper;
	
    private StringBuilder json;
	
    //getAllGenres
    public List<GenresEntity> getAllGenres() throws IOException{
        mapper = new ObjectMapper();
        StringBuilder json = getStringFromRequest("genre/movie/list?api_key=");
        GenresEntity[] resp  = mapper.readValue(mapper.readTree(json.toString()).get("genres").toString(),GenresEntity[].class);
        return Arrays.asList(resp);
    }
    
    //getAllPopularMovies
    public List<PopularMoviesEntity> getAllPopularMovies() throws IOException {
        StringBuilder json = getStringFromRequest("movie/popular?api_key=");
        PopularMoviesEntity[] resp  = mapper.readValue(mapper.readTree(json.toString()).get("results").toString(),PopularMoviesEntity[].class);
        return Arrays.asList(resp);
    }
    
    //getTopRatedMovies
    public List<TopRatedMoviesEntity> getTopRatedMovies() throws IOException {
        StringBuilder json = getStringFromRequest("movie/top_rated?api_key=");
        TopRatedMoviesEntity[] resp  = mapper.readValue(mapper.readTree(json.toString()).get("results").toString(),TopRatedMoviesEntity[].class);
        return Arrays.asList(resp);
    }
    
    //getMoviesById
    public MovieEntity getMoviesById(Integer id) throws IOException {
        System.out.println(id.toString());
        StringBuilder json = getStringFromRequest("movie/"+id.toString()+"?api_key=");
        mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY,true);
        MovieEntity resp  = mapper.readValue(json.toString(),MovieEntity.class);
        return resp;
    }
    
    
    //Get the cast and crew for a movie getCreditMovieById
    public CreditsEntity getCreditMovieById(Integer movie_id) throws IOException {
        StringBuilder json = getStringFromRequest("movie/"+movie_id.toString()+"/credits?api_key=");
        CastEntity[] respCastEntity  = mapper.readValue(mapper.readTree(json.toString()).get("cast").toString(),CastEntity[].class);
        CrewEntity[] respCrewEntity  = mapper.readValue(mapper.readTree(json.toString()).get("crew").toString(),CrewEntity[].class);
        CreditsEntity resp = new CreditsEntity();

        resp.setCastEntity(Arrays.asList(respCastEntity));
        resp.setCrewEntity(Arrays.asList(respCrewEntity));

        return resp;
    }
    
    //getImageMovieById
    public BackPostersEntity getImageMovieById(Integer movie_id) throws IOException {
        StringBuilder json = getStringFromRequest("movie/"+movie_id.toString()+"/images?api_key=");

        System.out.println(json.toString());

        ImagesEntity[] responseBackdrops  = mapper.readValue(mapper.readTree(json.toString()).get("backdrops").toString(),ImagesEntity[].class);
        ImagesEntity[] responsePosters  = mapper.readValue(mapper.readTree(json.toString()).get("posters").toString(),ImagesEntity[].class);

        BackPostersEntity resp = new BackPostersEntity();
        resp.setBackdrops(Arrays.asList(responseBackdrops));
        resp.setBackdrops(Arrays.asList(responsePosters));
        return resp;
    }
    
    //getKeywordsMovieById
    public List<KeywordsEntity> getKeywordsMovieById(Integer movie_id) throws IOException {
        StringBuilder json = getStringFromRequest("movie/"+movie_id.toString()+"/keywords?api_key=");
        KeywordsEntity[] resp  = mapper.readValue(mapper.readTree(json.toString()).get("keywords").toString(),KeywordsEntity[].class);
        return Arrays.asList(resp);

    }
    
    //getRecommendationsById
    public List<MovieEntity> getRecommendationsById(Integer movie_id) throws IOException {
        StringBuilder json = getStringFromRequest("movie/"+movie_id.toString()+"/recommendations?api_key=");
        MovieEntity[] resp  = mapper.readValue(mapper.readTree(json.toString()).get("results").toString(),MovieEntity[].class);
        return Arrays.asList(resp);
    }
    
    //getSimilarMoviesById
    public List<MovieEntity> getSimilarMoviesById(Integer movie_id) throws IOException {
        StringBuilder json = getStringFromRequest("movie/"+movie_id.toString()+"/similar?api_key=");
        MovieEntity[] resp  = mapper.readValue(mapper.readTree(json.toString()).get("results").toString(),MovieEntity[].class);
        return Arrays.asList(resp);
    }
    

    private StringBuilder getStringFromRequest(String request) throws IOException {
        mapper = new ObjectMapper();
        URL url = new URL(link + request + apiKey);

        InputStream input = url.openStream();
        InputStreamReader rd = new InputStreamReader(input);
        BufferedReader reader = new BufferedReader(rd);
        json = new StringBuilder();
        int s;
        while((s = reader.read()) != -1){
            json.append((char) s);
        }
        return json;
    }

}
