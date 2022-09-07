package com.sinensia.MyMovieApi.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class CastEntity {

	private boolean adult;
	private Long cast_id;
	private String character;
	private String credit_id;
	private int gender;
	private Long id;
	private String known_for_department;
	private String name;
	private Long order;
	private String original_name;
	private float popularity;
	private String profile_path;

	public CastEntity() {

	}


	public CastEntity(boolean adult, Long cast_id, String character, String credit_id, int gender, Long id,
			String known_for_department, String name, Long order, String original_name, float popularity,
			String profile_path) {
		super();
		this.adult = adult;
		this.cast_id = cast_id;
		this.character = character;
		this.credit_id = credit_id;
		this.gender = gender;
		this.id = id;
		this.known_for_department = known_for_department;
		this.name = name;
		this.order = order;
		this.original_name = original_name;
		this.popularity = popularity;
		this.profile_path = profile_path;
	}

	public boolean isAdult() {
		return adult;
	}

	public void setAdult(boolean adult) {
		this.adult = adult;
	}

	public Long getCast_id() {
		return cast_id;
	}

	public void setCast_id(Long cast_id) {
		this.cast_id = cast_id;
	}

	public String getCharacter() {
		return character;
	}

	public void setCharacter(String character) {
		this.character = character;
	}

	public String getCredit_id() {
		return credit_id;
	}

	public void setCredit_id(String credit_id) {
		this.credit_id = credit_id;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getKnown_for_department() {
		return known_for_department;
	}

	public void setKnown_for_department(String known_for_department) {
		this.known_for_department = known_for_department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getOrder() {
		return order;
	}

	public void setOrder(Long order) {
		this.order = order;
	}

	public String getOriginal_name() {
		return original_name;
	}

	public void setOriginal_name(String original_name) {
		this.original_name = original_name;
	}

	public float getPopularity() {
		return popularity;
	}

	public void setPopularity(float popularity) {
		this.popularity = popularity;
	}

	public String getProfile_path() {
		return profile_path;
	}

	public void setProfile_path(String profile_path) {
		this.profile_path = profile_path;
	}


	@Override
	public String toString() {
		return "CastEntity [adult=" + adult + ", cast_id=" + cast_id + ", character=" + character + ", credit_id="
				+ credit_id + ", gender=" + gender + ", id=" + id + ", known_for_department=" + known_for_department
				+ ", name=" + name + ", order=" + order + ", original_name=" + original_name + ", popularity="
				+ popularity + ", profile_path=" + profile_path + "]";
	}





}
