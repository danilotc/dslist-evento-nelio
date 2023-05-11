package edu.danilotc.dslist.dto;

import edu.danilotc.dslist.entities.GameList;

public class GameListDTO {
	private Long id;
	private String name;
	
	public GameListDTO() {
	}

	public GameListDTO(GameList entity) {
		id = entity.getId();
		name = entity.getName();
	}

	// Por não estarmos usando a classe BeanUtils podemos
	// implementar apenas os getters

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}
