package com.iessotero.divertida.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.iessotero.divertida.model.Videos;
import com.iessotero.divertida.repository.IVideoRepository;

@Service
public class VideoService {

	@Autowired
	private IVideoRepository VideoRepository;

	public List<Videos> findFavoritesVideos(Long idUser) {
		return (List<Videos>) VideoRepository.findFavoritesVideos(idUser);
	}

	public void addFavoriteVideo(Long idVideo, Long idUser) {
		int result = VideoRepository.existsFavoriteVideo(idVideo, idUser);
		if (result == 1) {
			VideoRepository.updateFavoriteVideo(idVideo, idUser);
		} else {
			VideoRepository.addFavoriteVideo(idVideo, idUser);
		}
	}

	public void deleteFavoriteVideos(Long idVideo, Long idUser) {
		VideoRepository.deleteFavoriteVideo(idVideo, idUser);
	}

	public List<Videos> getAllVideos() {
		return VideoRepository.findAll();
	}

	public List<Videos> recommendedVideos() {
		return VideoRepository.recommendedVideos();
	}
}