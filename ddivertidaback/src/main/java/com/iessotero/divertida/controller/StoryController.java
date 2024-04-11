package com.iessotero.divertida.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iessotero.divertida.model.Stories;
import com.iessotero.divertida.services.StoryService;

@RestController
@RequestMapping("/story")
public class StoryController {

	@Autowired
	StoryService storyService;

	@GetMapping()
	public List<Stories> getStories() {
		return storyService.getAllStories();
	}

	/*Cambiar esto al cambiar la tabla*/
	@GetMapping("/storiesByCategory/{category}")
	public List<Stories> getStoriesByCategories(@PathVariable String category) {

		List<Long> categoryIds = storyService.getCategoryIdByCategory(category);

		if (!categoryIds.isEmpty()) {

			List<Long> storyIds = storyService.findStoryIdsByCategoryIds(categoryIds);

			if (!storyIds.isEmpty()) {
				List<Stories> stories = storyService.getStoriesByIds(storyIds);

				if (!stories.isEmpty()) {
					  System.out.println(stories.toString());
					return stories;
				} else {
					return null;
				}
			} else {
				return null;
			}
		} else {

			return null;
		}
	}

}
