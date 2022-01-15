package com.rampazio.drmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rampazio.drmovie.entities.Movie;

public interface  MovieRepository extends JpaRepository<Movie, Long>{
	
	

}
