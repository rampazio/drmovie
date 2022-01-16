package com.rampazio.drmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rampazio.drmovie.entities.Score;
import com.rampazio.drmovie.entities.ScorePK;

public interface  ScoreRepository extends JpaRepository<Score, ScorePK>{
	
	

}
