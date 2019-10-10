package com.zohebrahiman.hangmanreport.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zohebrahiman.hangmanreport.model.Guess;
import com.zohebrahiman.hangmanreport.payload.GuessResponse;
import com.zohebrahiman.hangmanreport.service.GuessService;

@RestController
@RequestMapping("/api/guesses")
public class GuessController {

	@Autowired
	private GuessService guessService;

	@GetMapping
	public List<GuessResponse> getAllGuesses() {
		List<Guess> guesses = guessService.findAll();

		List<GuessResponse> guessResponses = new ArrayList<>();
		for (Guess guess : guesses) {
			guessResponses.add(new GuessResponse(guess.getId(), guess.getGuess()));
		}
		return guessResponses;
	}

}
