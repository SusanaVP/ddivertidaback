package com.iessotero.divertida.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "riddles_categories_mapping")
public class RiddlesCategoriesMapping {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne(cascade = CascadeType.ALL) // Agregar el atributo cascade
	@JoinColumn(name = "riddle_id", referencedColumnName = "id", nullable = false)
	private Riddles riddle;

	@ManyToOne
	@JoinColumn(name = "category_riddles_id", referencedColumnName = "id", nullable = false)
	private CategoriesRiddles categoriesRiddles;

	public RiddlesCategoriesMapping() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Riddles getRiddle() {
		return riddle;
	}

	public void setRiddle(Riddles riddle) {
		this.riddle = riddle;
	}

	public CategoriesRiddles getCategoriesRiddles() {
		return categoriesRiddles;
	}

	public void setCategoriesRiddles(CategoriesRiddles categoriesRiddles) {
		this.categoriesRiddles = categoriesRiddles;
	}

}
