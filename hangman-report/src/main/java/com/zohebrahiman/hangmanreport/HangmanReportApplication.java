package com.zohebrahiman.hangmanreport;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HangmanReportApplication {

	public static void main(String[] args) {
		SpringApplication.run(HangmanReportApplication.class, args);
	}

	@RequestMapping("/")
	public String sayHello() {
		return "Welcome to Hangman Report!";
	}
}
