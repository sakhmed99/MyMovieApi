package com.sinensia.MyMovieApi.Entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class BackPostersEntity {

	private List<ImagesEntity> backdrops;

	private int id;

	private List<ImagesEntity> posters;


	public BackPostersEntity() {

	}


	public List<ImagesEntity> getBackdrops() {
		return backdrops;
	}


	public void setBackdrops(List<ImagesEntity> backdrops) {
		this.backdrops = backdrops;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public List<ImagesEntity> getPosters() {
		return posters;
	}


	public void setPosters(List<ImagesEntity> posters) {
		this.posters = posters;
	}


	@Override
	public String toString() {
		return "BackPostersEntity [backdrops=" + backdrops + ", id=" + id + ", posters=" + posters + "]";
	}






}
