package com.personalstudies.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.personalstudies.dslist.dto.GameMinDTO;
import com.personalstudies.dslist.entities.Game;
import com.personalstudies.dslist.repositories.IGameRepository;

@Service
public class GameService {

    @Autowired
    private IGameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        
        return result.stream().map(GameMinDTO::new).toList();
    }
}