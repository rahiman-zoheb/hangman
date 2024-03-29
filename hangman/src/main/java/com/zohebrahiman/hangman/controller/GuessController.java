package com.zohebrahiman.hangman.controller;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.zohebrahiman.hangman.model.Guess;
import com.zohebrahiman.hangman.payload.ApiResponse;
import com.zohebrahiman.hangman.payload.GuessRequest;
import com.zohebrahiman.hangman.payload.GuessResponse;
import com.zohebrahiman.hangman.service.GuessService;

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

	@PostMapping
	public ResponseEntity<?> createGuess(@Valid @RequestBody GuessRequest guessRequest) {
		Guess guess = guessService.createGuess(guessRequest);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{guessId}").buildAndExpand(guess.getId())
				.toUri();

		return ResponseEntity.created(location).body(new ApiResponse(true, "Guess Created Successfully"));
	}

}
