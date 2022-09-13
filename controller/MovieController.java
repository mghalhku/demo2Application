package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Movie;
import com.example.demo.service.MovieService;

@RestController
public class MovieController {
	
	@Autowired
	MovieService ms;
	
	
	
		@GetMapping("/movie")
		List<Movie>getAllTrainee(){
			return ms.getAllMovies();
		}
		
		@GetMapping("/movie/byGener/{gener}")
		Movie getMovieByGener(@PathVariable("gener") String gener)
		{
			return ms.getMovieByGener(gener);
		}
		
			
		@PostMapping("/movies")
		String insertTrainee(@RequestBody Movie mvs)
			{
			return ms.addMovie(mvs);
			
		}
		
		@DeleteMapping("/movies/byName/{name}")
		Movie deleteTrainee(@PathVariable("name") String name){
			return ms.deletMovieByName(name);
			
		}
		
		@PutMapping("/movies")
		String updateTrainee(@RequestBody Movie name){
			return ms.updateMovie(name);
			
		}
	}

	
	

