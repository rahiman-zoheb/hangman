package com.zohebrahiman.hangman;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class tester {

	public static List<String> words = new ArrayList<>();
	private static File file = new File("dictionary.txt");

	public static void main(String... args) {

		try {
			Scanner sc = new Scanner(file);
			for (int i = 0; i < 100; i++) {
				words.add(sc.next());
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		Random random = new Random();
		int wordNumber = random.nextInt(words.size());

		int countGuesses = 0;
		Scanner in = new Scanner(System.in);

		System.out.println("Great to have you here!!");

		String wordString = words.get(wordNumber);
		char[] guessedWordArray = new char[wordString.length()];
		String guessedWordString = "";

		while (!guessedWordString.equals(wordString)) {
			// input a character
			System.out.print("Please enter a single character: ");
			String inputString = in.next();
			if (inputString.length() > 1 || inputString.isEmpty()) {
				System.out.println("You have to enter exactly 1 character!");
				continue;
			}
			char input = inputString.charAt(0);
			if (input<'a' || input>'z') {
				System.out.println("You have to enter a character!");
				continue;
			}
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
