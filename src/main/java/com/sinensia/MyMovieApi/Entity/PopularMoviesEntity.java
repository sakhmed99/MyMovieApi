package com.sinensia.MyMovieApi.Entity;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)

public class PopularMoviesEntity {
	
	private boolean adult;
	
	private String backdrop_path;
	
	private int[] genre_ids;
	
	private long id;
	
	private String original_language;
	
	private String original_title;
	
	private String overview;
	
	private float popularity;
	
	private String poster_path;
	
	private String release_date;
	
	private String title;
	
	private boolean video;
	
	private float vote_average;
	
	private long vote_count;
	
	
	public PopularMoviesEntity() {
		
	}
	
	public PopularMoviesEntity(boolean adult, String backdrop_path, int[] genre_ids, long id, String original_language,
			String original_title, String overview, float popularity, String poster_path, String release_date,
			String title, boolean video, float vote_average, long vote_count) {
		super();
		this.adult = adult;
		this.backdrop_path = backdrop_path;
		this.genre_ids = genre_ids;
		this.id = id;
		this.original_language = original_language;
		this.original_title = original_title;
		this.overview = overview;
		this.popularity = popularity;
		this.poster_path = poster_path;
		this.release_date = release_date;
		this.title = title;
		this.video = video;
		this.vote_average = vote_average;
		this.vote_count = vote_count;
	}


	public boolean isAdult() {
		return adult;
	}


	public void setAdult(boolean adult) {
		this.adult = adult;
	}


	public String getBackdrop_path() {
		return backdrop_path;
	}


	public void setBackdrop_path(String backdrop_path) {
		this.backdrop_path = backdrop_path;
	}


	public int[] getGenre_ids() {
		return genre_ids;
	}


	public void setGenre_ids(int[] genre_ids) {
		this.genre_ids = genre_ids;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getOriginal_language() {
		return original_language;
	}


	public void setOriginal_language(String original_language) {
		this.original_language = original_language;
	}


	public String getOriginal_title() {
		return original_title;
	}


	public void setOriginal_title(String original_title) {
		this.original_title = original_title;
	}


	public String getOverview() {
		return overview;
	}


	public void setOverview(String overview) {
		this.overview = overview;
	}


	public float getPopularity() {
		return popularity;
	}


	public void setPopularity(float popularity) {
		this.popularity = popularity;
	}


	public String getPoster_path() {
		return poster_path;
	}


	public void setPoster_path(String poster_path) {
		this.poster_path = poster_path;
	}


	public String getRelease_date() {
		return release_date;
	}


	public void setRelease_date(String release_date) {
		this.release_date = release_date;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public boolean isVideo() {
		return video;
	}


	public void setVideo(boolean video) {
		this.video = video;
	}


	public float getVote_average() {
		return vote_average;
	}


	public void setVote_average(float vote_average) {
		this.vote_average = vote_average;
	}


	public long getVote_count() {
		return vote_count;
	}


	public void setVote_count(long vote_count) {
		this.vote_count = vote_count;
	}

	@Override
	public String toString() {
		return "PopularMoviesEntity [adult=" + adult + ", backdrop_path=" + backdrop_path + ", genre_ids="
				+ Arrays.toString(genre_ids) + ", id=" + id + ", original_language=" + original_language
				+ ", original_title=" + original_title + ", overview=" + overview + ", popularity=" + popularity
				+ ", poster_path=" + poster_path + ", release_date=" + release_date + ", title=" + title + ", video="
				+ video + ", vote_average=" + vote_average + ", vote_count=" + vote_count + "]";
	}


	


}