package com.zohebrahiman.hangmanreport.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohebrahiman.hangmanreport.model.Guess;
import com.zohebrahiman.hangmanreport.repository.GuessRepository;

@Service
public class GuessService {

	@Autowired
	private GuessRepository guessRepository;

	public List<Guess> findAll() {
		return guessRepository.findAll();
	}

}
