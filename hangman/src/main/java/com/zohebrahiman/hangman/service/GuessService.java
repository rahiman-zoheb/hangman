package com.zohebrahiman.hangman.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohebrahiman.hangman.model.Guess;
import com.zohebrahiman.hangman.payload.GuessRequest;
import com.zohebrahiman.hangman.repository.GuessRepository;

@Service
public class GuessService {

	@Autowired
	private GuessRepository guessRepository;

	public Guess createGuess(GuessRequest guessRequest) {
		Guess guess = new Guess();
		guess.setGuess(guessRequest.getGuess());

		return guessRepository.save(guess);
	}

}
