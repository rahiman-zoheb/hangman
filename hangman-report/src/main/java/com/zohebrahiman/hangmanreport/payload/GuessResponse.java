package com.zohebrahiman.hangmanreport.payload;

public class GuessResponse {
	private Long id;
	private String guess;

	public GuessResponse(Long id, String guess) {
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

	public String getGuess() {
		return guess;
	}

	public void setGuess(String guess) {
		this.guess = guess;
	}

}
