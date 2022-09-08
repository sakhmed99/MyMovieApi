package com.sinensia.MyMovieApi.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_movie")
public class Usuario {

	@Id
	@Column(name = "id", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "username", nullable = false)
	String username;
	
	@Column(name = "password", nullable = false)
	String password;
	
	String movieId;
	
	Boolean favorite;
	
	@Column(name = "enabled", nullable = false)
	Boolean enabled;
	
	Integer personal_rating;
	
	String notes;

	public Usuario() {
		
	}

	public Usuario(Long id, String username, String password, String movieId, Boolean favorite, Boolean enabled,
			Integer personal_rating, String notes) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.movieId = movieId;
		this.favorite = favorite;
		this.enabled = enabled;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public Boolean getFavorite() {
		return favorite;
	}

	public void setFavorite(Boolean favorite) {
		this.favorite = favorite;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
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
		return "Usuario [id=" + id + ", username=" + username + ", password=" + password + ", movieId=" + movieId
				+ ", favorite=" + favorite + ", enabled=" + enabled + ", personal_rating=" + personal_rating
				+ ", notes=" + notes + "]";
	}

	
}
