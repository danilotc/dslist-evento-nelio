package edu.danilotc.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.danilotc.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
