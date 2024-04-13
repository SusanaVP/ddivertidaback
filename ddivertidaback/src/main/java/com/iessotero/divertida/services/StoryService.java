package com.iessotero.divertida.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iessotero.divertida.model.Stories;
import com.iessotero.divertida.repository.IStoryRepository;

@Service
public class StoryService {

	@Autowired
	private IStoryRepository storyRepository;

	public List<Stories> getAllStories() {
      return storyRepository.findAll();
	}

//	public List<Long> getCategoryIdByCategory(String category) {
//		return storyRepository.findCategoryIdsByCategory(category);
//	}
//
//	public List<Long> findStoryIdsByCategoryIds(List<Long> categoryIds) {
//		return storyRepository.findStoryIdsByCategoryIds(categoryIds);
//	}

	public List<Stories> getStoriesByIds(List<Long> storyIds) {
		return storyRepository.findStoriesByIds(storyIds);
	}
	
	
}
