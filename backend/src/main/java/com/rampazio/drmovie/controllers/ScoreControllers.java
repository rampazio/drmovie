package com.rampazio.drmovie.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rampazio.drmovie.dto.MovieDTO;
import com.rampazio.drmovie.dto.ScoreDTO;
import com.rampazio.drmovie.services.ScoreService;


@RestController
@RequestMapping(value = "/scores")
public class ScoreControllers {
	
	@Autowired
	private ScoreService service;
	
	
	@PutMapping
	public MovieDTO saveScore(@RequestBody ScoreDTO dto) {
		MovieDTO movieDTO = service.saveScore(dto);
		return movieDTO;
	}
}




































