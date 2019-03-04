package com.pragim.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="movie_tab")
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "movie_seq")
    @SequenceGenerator(name = "movie_seq", sequenceName = "movie_seq",allocationSize=1,initialValue=1)
	private int movId;
	private String movName;
	private String banner;
	private int noOfActors;
	private Date releaseDate;
	
	@JoinColumn(name="act_id")
	@OneToMany(cascade=CascadeType.ALL,targetEntity=Actor.class)
	private Set<Actor> actorList;

	public Movie(String movName, String banner, int noOfActors,
			Date releaseDate, Set<Actor> actorList) {
		this.movName = movName;
		this.banner = banner;
		this.noOfActors = noOfActors;
		this.releaseDate = releaseDate;
		this.setActorList(actorList);
	}

	public int getMovId() {
		return movId;
	}

	public String getMovName() {
		return movName;
	}

	public String getBanner() {
		return banner;
	}

	public int getNoOfActors() {
		return noOfActors;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public Set<Actor> getActorList() {
		return actorList;
	}

	public void setActorList(Set<Actor> actorList) {
		this.actorList = actorList;
	}

	@Override
	public String toString() {
		return "Movie [movId=" + movId + ", movName=" + movName + ", banner="
				+ banner + ", noOfActors=" + noOfActors + ", releaseDate="
				+ releaseDate + "]";
	}
	
	

}
