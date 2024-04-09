package com.iessotero.divertida.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "categories_story")
public class CategoriesStory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column
	private boolean classic = false;

	@Column
	private boolean shortStory = false;

	@Column
	private boolean animal = false;

	@Column
	private boolean princess = false;

	@Column
	private boolean sleep = false;

	@Column
	private boolean christmas = false;


	public CategoriesStory() {
	}

	public boolean isClassic() {
		return classic;
	}

	public void setClassic(boolean classic) {
		this.classic = classic;
	}

	public boolean isShortStory() {
		return shortStory;
	}

	public void setShortStory(boolean shortStory) {
		this.shortStory = shortStory;
	}

	public boolean isAnimal() {
		return animal;
	}

	public void setAnimal(boolean animal) {
		this.animal = animal;
	}

	public boolean isPrincess() {
		return princess;
	}

	public void setPrincess(boolean princess) {
		this.princess = princess;
	}

	public boolean isSleep() {
		return sleep;
	}

	public void setSleep(boolean sleep) {
		this.sleep = sleep;
	}

	public boolean isChristmas() {
		return christmas;
	}

	public void setChristmas(boolean christmas) {
		this.christmas = christmas;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
