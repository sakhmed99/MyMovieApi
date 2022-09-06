package com.sinensia.MyMovieApi.Entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class BackPostersEntity {
	
	private List<ImagesEntity> backdrops;
	
	private List<ImagesEntity> logo;
	
	private List<ImagesEntity> posters;
	
	
	public BackPostersEntity() {
		
	}


	public BackPostersEntity(List<ImagesEntity> backdrops, List<ImagesEntity> logo, List<ImagesEntity> posters) {
		super();
		this.backdrops = backdrops;
		this.logo = logo;
		this.posters = posters;
	}


	public List<ImagesEntity> getBackdrops() {
		return backdrops;
	}


	public void setBackdrops(List<ImagesEntity> backdrops) {
		this.backdrops = backdrops;
	}


	public List<ImagesEntity> getLogo() {
		return logo;
	}


	public void setLogo(List<ImagesEntity> logo) {
		this.logo = logo;
	}


	public List<ImagesEntity> getPosters() {
		return posters;
	}


	public void setPosters(List<ImagesEntity> posters) {
		this.posters = posters;
	}


	@Override
	public String toString() {
		return "BackPostersEntity [backdrops=" + backdrops + ", logo=" + logo + ", posters=" + posters + "]";
	}
	
	

}
