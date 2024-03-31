package com.iessotero.divertida.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "category")
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column
	private boolean origami = false;

	@Column
	private boolean crafts = false;

	@Column
	private boolean skill = false;

	@Column
	private boolean cardboard = false;

	@Column(name = "old_school")
	private boolean oldSchool = false;

	@Column
	private boolean outdoor = false;

	public Category() {
	}

	public boolean isOrigami() {
		return origami;
	}

	public void setOrigami(boolean origami) {
		this.origami = origami;
	}

	public boolean isCrafts() {
		return crafts;
	}

	public void setCrafts(boolean crafts) {
		this.crafts = crafts;
	}

	public boolean isSkill() {
		return skill;
	}

	public void setSkill(boolean skill) {
		this.skill = skill;
	}

	public boolean isCardboard() {
		return cardboard;
	}

	public void setCardboard(boolean cardboard) {
		this.cardboard = cardboard;
	}

	public boolean isOldSchool() {
		return oldSchool;
	}

	public void setOldSchool(boolean oldSchool) {
		this.oldSchool = oldSchool;
	}

	public boolean isOutdoor() {
		return outdoor;
	}

	public void setOutdoor(boolean outdoor) {
		this.outdoor = outdoor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
