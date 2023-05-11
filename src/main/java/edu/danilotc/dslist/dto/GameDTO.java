package edu.danilotc.dslist.dto;

import org.springframework.beans.BeanUtils;

import edu.danilotc.dslist.entities.Game;

public class GameDTO {
	private Long id;
	private String title;
	private Integer year;
	private String genre;
	private String platforms;
	private Double score;
	private String imgUrl;
	private String shortDescription;
	private String longDescription;
	
	public GameDTO() {
	}
	
	/**
	 * Este construtor está usando a classe utilitária BeanUtils do
	 * spring framework para copiar dados de uma classe para outra e
	 * isso é útil quando se tem muitos atributos para copiar.
	 * 
	 * O segundo argumento do método copyProperties está se referindo
	 * a esta classe indicando que todos os valores que forem setados
	 * na classe Game serão copiados para esta classe.
	 * 
	 * O this pode ser usado desde que esta classe tenha todos os seus
	 * atributos com o mesmo nome dos atributos da classe Game.
	 * 
	 * copyProperties(entidadeOrigem, entidadeDestino)
	 * 
	 * @param entity
	 */
	public GameDTO(Game entity) {
		BeanUtils.copyProperties(entity, this);
	}

	// Obrigatório criar getters e setters para todos os atributos,
	// só assim a classe utilitária usada no contrutor funcionará.

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getPlatforms() {
		return platforms;
	}

	public void setPlatforms(String platforms) {
		this.platforms = platforms;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}
}
