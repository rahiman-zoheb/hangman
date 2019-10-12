package com.zohebrahiman.hangman;

import java.util.Random;
import java.util.Scanner;

public class tester {

	public static String[] words = new String[3];

	static {
		words[0] = "test";
		words[1] = "random";
		words[2] = "jazz";
	}

	public static void main(String... args) {

		Random random = new Random();
		int wordNumber = random.nextInt(3);

		int countGuesses = 0;
		Scanner in = new Scanner(System.in);

		String wordString = words[wordNumber];
		char[] guessedWordArray = new char[wordString.length()];
		String guessedWordString = "";

		while (!guessedWordString.equals(wordString)) {

			// input character
			String inputString = in.next();
			if (inputString.length() > 1 || inputString.isEmpty()) {
				System.out.println("You have to enter one character exactly!");
				continue;
			}
			char input = inputString.charAt(0);
			countGuesses++;

			// if character in word, add characters at right position to guessedWord
			// else, continue.
			if (wordString.indexOf(input) != -1) {
				for (int i = 0; i < wordString.length(); i++) {
					if (wordString.charAt(i) == input) {
						guessedWordArray[i] = input;
					}
				}

				guessedWordString = String.valueOf(guessedWordArray);

				System.out.println("Great, the character " + input + " is in the word. Your current guessed word is '"
						+ guessedWordString + "'");
			} else {
				System.out.println("Sorry, the character " + input
						+ " is not in the word. Your current guessed word is '" + guessedWordString + "'");
			}
		}

		in.close();
		System.out.println("Congratulations - you took " + countGuesses + " guesses.");
	}
}
