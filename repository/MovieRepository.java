package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Movie;
@Repository("mv")
public interface MovieRepository extends JpaRepository<Movie, String>{
	Optional<Movie> findByGener(String gener);
	Optional<Movie> deleteByMovieName(String name);
	
}
