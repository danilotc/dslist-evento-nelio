package edu.danilotc.dslist.entities;

import java.util.Objects;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_belonging")
public class Belonging {
	
	// BelongingPK eh uma classe auxiliar criada para representar
	// a chave multipla da relacao muitos para muitos
	
	@EmbeddedId
	private BelongingPK id = new BelongingPK();
	private Integer position;
	
	public Belonging() {
	}
	
	/**
	 * A associação entre Game e GameList está sendo feita neste
	 * momento através dos métodos setGame e setList contidos na
	 * classe BelongingPK.
	 * 
	 * @param game
	 * @param list
	 * @param position
	 */
	public Belonging(Game game, GameList list, Integer position) {
		id.setGame(game);
		id.setList(list);
		this.position = position;
	}

	public BelongingPK getId() {
		return id;
	}

	public void setId(BelongingPK id) {
		this.id = id;
	}

	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Belonging other = (Belonging) obj;
		return Objects.equals(id, other.id);
	}
}
