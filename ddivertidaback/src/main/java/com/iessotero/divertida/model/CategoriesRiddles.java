package com.iessotero.divertida.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "categories_riddles")
public class CategoriesRiddles {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column
	private boolean food = false;

	@Column
	private boolean plants = false;

	@Column
	private boolean animal = false;

	@Column
	private boolean family = false;

	@Column
	private boolean music = false;

	@Column
	private boolean people = false;

	public CategoriesRiddles() {
	}

	public boolean isFood() {
		return food;
	}

	public void setFood(boolean food) {
		this.food = food;
	}

	public boolean isPlants() {
		return plants;
	}

	public void setPlants(boolean plants) {
		this.plants = plants;
	}

	public boolean isAnimal() {
		return animal;
	}

	public void setAnimal(boolean animal) {
		this.animal = animal;
	}

	public boolean isFamily() {
		return family;
	}

	public void setFamily(boolean family) {
		this.family = family;
	}

	public boolean isMusic() {
		return music;
	}

	public void setMusic(boolean music) {
		this.music = music;
	}

	public boolean isPeople() {
		return people;
	}

	public void setPeople(boolean people) {
		this.people = people;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
}
