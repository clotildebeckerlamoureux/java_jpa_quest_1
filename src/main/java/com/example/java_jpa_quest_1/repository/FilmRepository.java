package com.example.java_jpa_quest_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.java_jpa_quest_1.entity.Film;

@Repository
public interface FilmRepository extends JpaRepository<Film, Long>{
    
}
