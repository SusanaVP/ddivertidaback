package com.iessotero.divertida.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iessotero.divertida.model.Videos;
import com.iessotero.divertida.services.VideoService;

@RestController
@RequestMapping("/video")
public class VideoController {

	@Autowired
	VideoService videoService;

	@GetMapping()
	public List<Videos> getVideos() {
		return videoService.getAllVideos();
	}

	@GetMapping("/delete/{idVideo}/{idUser}")
	public void deleteFavoriteVideo(@PathVariable Long idVideo, @PathVariable Long idUser) {
		this.videoService.deleteFavoriteVideos(idVideo, idUser);
	}

	@GetMapping("/addFavorite/{idVideo}/{idUser}")
	public void addFavoriteVideo(@PathVariable Long idVideo, @PathVariable Long idUser) {
		this.videoService.addFavoriteVideo(idVideo, idUser);
	}

	@GetMapping("/favorites/{idUser}")
	public List<Videos> getFavoritesVideos(@PathVariable Long idUser) {
		return this.videoService.findFavoritesVideos(idUser);
	}

	@GetMapping("/recommended")
	public List<Videos> getRecommendedVideos() {
		return this.videoService.recommendedVideos();
	}
	

	@GetMapping("/categories/{category}")
	public List<Videos> getVideosByCategory(@PathVariable String category) {
		
		List<Videos> videos = this.videoService.getVideosByCategory(category);
		
		/*consigo la id de la categoria que ocincide con el sTring*/
		
		/*Luego con esa id busco en la tabla mapping y obtengo los IDs de los vídeos de esas categorías*/
		
		/*Ñuego devuelvo los vídeos que coincidan..*/
		
		
		return  this.videoService.getVideosByCategory(category); 
	}
}
