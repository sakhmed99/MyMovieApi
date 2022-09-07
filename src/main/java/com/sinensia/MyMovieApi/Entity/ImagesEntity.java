package com.sinensia.MyMovieApi.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class ImagesEntity {

	private float aspect_ratio;

	private String file_path;

	private int height;

	private String iso_639_1;

	private int vote_average;

	private int vote_count;

	private int width;


	public ImagesEntity() {

	}


	public ImagesEntity(float aspect_ratio, String file_path, int height, String iso_639_1, int vote_average,
			int vote_count, int width) {
		super();
		this.aspect_ratio = aspect_ratio;
		this.file_path = file_path;
		this.height = height;
		this.iso_639_1 = iso_639_1;
		this.vote_average = vote_average;
		this.vote_count = vote_count;
		this.width = width;
	}


	public float getAspect_ratio() {
		return aspect_ratio;
	}


	public void setAspect_ratio(float aspect_ratio) {
		this.aspect_ratio = aspect_ratio;
	}


	public String getFile_path() {
		return file_path;
	}


	public void setFile_path(String file_path) {
		this.file_path = file_path;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	public String getIso_639_1() {
		return iso_639_1;
	}


	public void setIso_639_1(String iso_639_1) {
		this.iso_639_1 = iso_639_1;
	}


	public int getVote_average() {
		return vote_average;
	}


	public void setVote_average(int vote_average) {
		this.vote_average = vote_average;
	}


	public int getVote_count() {
		return vote_count;
	}


	public void setVote_count(int vote_count) {
		this.vote_count = vote_count;
	}


	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}


	@Override
	public String toString() {
		return "ImagesEntity [aspect_ratio=" + aspect_ratio + ", file_path=" + file_path + ", height=" + height
				+ ", iso_639_1=" + iso_639_1 + ", vote_average=" + vote_average + ", vote_count=" + vote_count
				+ ", width=" + width + "]";
	}





}
