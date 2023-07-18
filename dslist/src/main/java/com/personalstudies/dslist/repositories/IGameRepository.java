package com.personalstudies.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.personalstudies.dslist.entities.Game;

public interface IGameRepository extends JpaRepository<Game, Long> {

}