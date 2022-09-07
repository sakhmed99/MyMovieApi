package com.sinensia.MyMovieApi.Entity;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)

public class MovieEntity {

	private boolean adult;
	private String backdrop_path;
	private int[] genres_id;
	private long budget;
	private long id;
	private String original_language;
	private String original_title;
	private String overview;
	private float popularity;
	private String poster_path;
	private String release_date;
	private long revenue;
	private String tagline;
	private String title;
	private boolean video;
	private float vote_average;
	private long vote_count;

	public MovieEntity() {

	}

	public MovieEntity(boolean adult, String backdrop_path, int[] genres_id, long budget, long id,
			String original_language, String original_title, String overview, float popularity, String poster_path,
			String release_date, long revenue, String tagline, String title, boolean video, float vote_average,
			long vote_count) {
		super();
		this.adult = adult;
		this.backdrop_path = backdrop_path;
		this.genres_id = genres_id;
		this.budget = budget;
		this.id = id;
		this.original_language = original_language;
		this.original_title = original_title;
		this.overview = overview;
		this.popularity = popularity;
		this.poster_path = poster_path;
		this.release_date = release_date;
		this.revenue = revenue;
		this.tagline = tagline;
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

	public int[] getGenres_id() {
		return genres_id;
	}

	public void setGenres_id(int[] genres_id) {
		this.genres_id = genres_id;
	}

	public long getBudget() {
		return budget;
	}

	public void setBudget(long budget) {
		this.budget = budget;
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

	public long getRevenue() {
		return revenue;
	}

	public void setRevenue(long revenue) {
		this.revenue = revenue;
	}

	public String getTagline() {
		return tagline;
	}

	public void setTagline(String tagline) {
		this.tagline = tagline;
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
		return "MovieEntity [adult=" + adult + ", backdrop_path=" + backdrop_path + ", genres_id="
				+ Arrays.toString(genres_id) + ", budget=" + budget + ", id=" + id + ", original_language="
				+ original_language + ", original_title=" + original_title + ", overview=" + overview + ", popularity="
				+ popularity + ", poster_path=" + poster_path + ", release_date=" + release_date + ", revenue="
				+ revenue + ", tagline=" + tagline + ", title=" + title + ", video=" + video + ", vote_average="
				+ vote_average + ", vote_count=" + vote_count + "]";
	}






}
