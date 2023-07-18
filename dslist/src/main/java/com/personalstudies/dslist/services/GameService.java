package com.personalstudies.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.personalstudies.dslist.dto.GameDTO;
import com.personalstudies.dslist.dto.GameMinDTO;
import com.personalstudies.dslist.entities.Game;
import com.personalstudies.dslist.projections.GameMinProjection;
import com.personalstudies.dslist.repositories.IGameRepository;

@Service
public class GameService {

    @Autowired
    private IGameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDTO findById(Long gameId) {
        Game result = gameRepository.findById(gameId).get();
        return new GameDTO(result);
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();

        return result.stream().map(GameMinDTO::new).toList();
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long listId) {
        List<GameMinProjection> result = gameRepository.searchByList(listId);

        return result.stream().map(GameMinDTO::new).toList();
    }
}