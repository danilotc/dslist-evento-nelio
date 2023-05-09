package edu.danilotc.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.danilotc.dslist.dto.GameMinDTO;
import edu.danilotc.dslist.entities.Game;
import edu.danilotc.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		// Transform the list Game to the list GameMinTDO and return this
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
}
