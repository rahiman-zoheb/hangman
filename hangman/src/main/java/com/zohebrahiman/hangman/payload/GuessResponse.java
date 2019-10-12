package com.zohebrahiman.hangman.payload;

public class GuessResponse {
	private Long id;
	private Character guess;

	public GuessResponse(Long id, Character guess) {
		super();
		this.id = id;
		this.guess = guess;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Character getGuess() {
		return guess;
	}

	public void setGuess(Character guess) {
		this.guess = guess;
	}

}
