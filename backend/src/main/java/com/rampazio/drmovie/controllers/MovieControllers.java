package com.rampazio.drmovie.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rampazio.drmovie.dto.MovieDTO;
import com.rampazio.drmovie.services.MovieService;

@RestController
@RequestMapping(value = "/movies")
public class MovieControllers {

	@Autowired
	private MovieService service;
	
	@GetMapping
	public Page<MovieDTO> findAll(Pageable pageable) {
		return service.findAll(pageable);
		
	}
	@GetMapping(value = "/{id}")
	public MovieDTO findById(@PathVariable Long id) {
		return service.finById(id);
	
	}
}




































