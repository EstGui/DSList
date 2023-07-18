package com.personalstudies.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.personalstudies.dslist.entities.GameList;

public interface IGameListRepository extends JpaRepository<GameList, Long> {

}