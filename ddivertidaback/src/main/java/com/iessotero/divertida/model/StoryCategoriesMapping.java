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
@Table(name = "story_categories_mapping")
public class StoryCategoriesMapping {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL) 
    @JoinColumn(name = "stories_id", referencedColumnName = "id", nullable = false)
    private Stories stories;

    @ManyToOne
    @JoinColumn(name = "categories_story_id", referencedColumnName = "id", nullable = false)
    private CategoriesStory categoriesStory;

    public StoryCategoriesMapping() {
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Stories getStories() {
		return stories;
	}

	public void setStories(Stories story) {
		this.stories = story;
	}

	public CategoriesStory getCategoriesStory() {
		return categoriesStory;
	}

	public void setCategoriesStory(CategoriesStory categoriesStory) {
		this.categoriesStory = categoriesStory;
	}
    

}
