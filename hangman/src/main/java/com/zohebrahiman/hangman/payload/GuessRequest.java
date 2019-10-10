package com.zohebrahiman.hangman.payload;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class GuessRequest {
	@NotBlank
	@Size(max = 140)
	private String guess;

	public String getGuess() {
		return guess;
	}

	public void setGuess(String guess) {
		this.guess = guess;
	}

}