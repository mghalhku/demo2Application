package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString
@EqualsAndHashCode

public class Movie {
	@Id
	private int movieId;
	private String movieName;
	private String movieGener;
	
	public Movie(int movieId,String movieName,String movieGener) {
		this.movieId=movieId;
		this.movieName=movieName;
		this.movieGener=movieGener;
	}
	public Movie() {}
	
}

