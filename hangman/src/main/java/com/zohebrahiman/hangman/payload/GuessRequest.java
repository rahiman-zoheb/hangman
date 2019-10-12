package com.zohebrahiman.hangman.payload;

import javax.validation.constraints.NotNull;

public class GuessRequest {

	@NotNull
	private Character guess;

	public Character getGuess() {
		return guess;
	}

	public void setGuess(Character guess) {
		this.guess = guess;
	}

}