package com.sinensia.MyMovieApi.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class KeywordsEntity {
	
	
	private int id;
	private String name;
	
	
	public KeywordsEntity() {
		
	}


	public KeywordsEntity(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}




	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "KeywordsEntity [id=" + id + ", name=" + name + "]";
	}
	
	

}
