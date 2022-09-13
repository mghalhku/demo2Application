package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Movie;
import com.example.demo.repository.MovieRepository;

@Service("ms")
public class MovieService {
	@Autowired
	MovieRepository mv;
	
	public List<Movie>  getAllMovies() {
		return mv.findAll();	
	}
	
	public Movie getMovieByGener(String gener) {
		Optional<Movie> op=mv.findByGener(gener);
		if(op.isPresent())
		   return op.get();
		else
			return null;
	}

	public Movie deletMovieByName(String name) {
		Optional<Movie> op=mv.deleteByMovieName(name);
		if(op.isPresent())
		   return op.get();
		else
			return null;
	}

	public String addMovie(Movie mvs) {
		mv.save(mvs);
		return "Inserted Successfully";
	}

	

	public String updateMovie(Movie mvs) {
		mv.save(mvs);
		return "Updated Successfully";
	}
	

}
