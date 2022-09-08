package com.sinensia.MyMovieApi.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)

public class CreditsEntity {


	public List<CastEntity> castEntity;
	public List<CrewEntity> crewEntity;

	public CreditsEntity() {

	}

	public CreditsEntity(List<CastEntity> castEntity, List<CrewEntity> crewEntity) {
		super();
		this.castEntity = castEntity;
		this.crewEntity = crewEntity;
	}

	public List<CastEntity> getCastEntity() {
		return castEntity;
	}

	public void setCastEntity(List<CastEntity> castEntity) {
		this.castEntity = castEntity;
	}

	public List<CrewEntity> getCrewEntity() {
		return crewEntity;
	}

	public void setCrewEntity(List<CrewEntity> crewEntity) {
		this.crewEntity = crewEntity;
	}

	@Override
	public String toString() {
		return "CreditsEntity [castEntity=" + castEntity + ", crewEntity=" + crewEntity + "]";
	}





}
