package com.zohebrahiman.hangman.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zohebrahiman.hangman.model.Guess;

@Repository
public interface GuessRepository extends JpaRepository<Guess, Long> {
	
	Optional<Guess> findById(Long guessId);
}
