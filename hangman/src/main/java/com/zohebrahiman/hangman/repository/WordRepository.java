package com.zohebrahiman.hangman.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zohebrahiman.hangman.model.Word;

@Repository
public interface WordRepository extends JpaRepository<Word, Long> {
}
