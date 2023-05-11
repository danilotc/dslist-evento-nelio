package edu.danilotc.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.danilotc.dslist.dto.GameDTO;
import edu.danilotc.dslist.dto.GameMinDTO;
import edu.danilotc.dslist.entities.Game;
import edu.danilotc.dslist.projections.GameMinProjection;
import edu.danilotc.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		// Estamos usando get() pressupondo que o id existirá, mas
		// o ideal é implementar um tratamento de exceção caso não
		// exista o id informado na requisição.
		Game result = gameRepository.findById(id).get();
		return new GameDTO(result);
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		// Transform the list Game to the list GameMinTDO and return this
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findByList(Long listId) {
		List<GameMinProjection> result = gameRepository.searchByList(listId);
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
}
