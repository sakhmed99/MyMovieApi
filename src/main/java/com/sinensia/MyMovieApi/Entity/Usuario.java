package com.sinensia.MyMovieApi.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "users")
public class Usuario {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)

	private Long id;
	private String username;
	private String movie;
	Boolean favorite;
	Integer personal_rating;
	String notes;


	public Usuario() {

	}


	public Usuario(Long id, String username, String movie, Boolean favorite, Integer personal_rating, String notes) {
		super();
		this.id = id;
		this.username = username;
		this.movie = movie;
		this.favorite = favorite;
		this.personal_rating = personal_rating;
		this.notes = notes;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getMovie() {
		return movie;
	}


	public void setMovie(String movie) {
		this.movie = movie;
	}


	public Boolean getFavorite() {
		return favorite;
	}


	public void setFavorite(Boolean favorite) {
		this.favorite = favorite;
	}


	public Integer getPersonal_rating() {
		return personal_rating;
	}


	public void setPersonal_rating(Integer personal_rating) {
		this.personal_rating = personal_rating;
	}


	public String getNotes() {
		return notes;
	}


	public void setNotes(String notes) {
		this.notes = notes;
	}


	@Override
	public String toString() {
		return "Usuario [id=" + id + ", username=" + username + ", movie=" + movie + ", favorite=" + favorite
				+ ", personal_rating=" + personal_rating + ", notes=" + notes + "]";
	}



}
