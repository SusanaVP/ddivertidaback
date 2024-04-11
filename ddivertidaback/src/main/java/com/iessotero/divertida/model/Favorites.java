package com.iessotero.divertida.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "favorites")
public class Favorites {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "user_id")
	private Long userId;

	@Column(name = "video_id")
	private Long videoId;

	@Column(name = "event_id")
	private Long eventId;

	@Column(name = "story_id")
	private Long storyId;

	@Column(name = "riddles_id")
	private Long riddlesId;

	public Favorites() {
	}

	// Definición de las claves foráneas
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id", referencedColumnName = "id", insertable = false, updatable = false)
	private User user;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "video_id", referencedColumnName = "id", insertable = false, updatable = false)
	private Videos video;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "event_id", referencedColumnName = "id", insertable = false, updatable = false)
	private Events event;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "story_id", referencedColumnName = "id", insertable = false, updatable = false)
	private Stories story;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "riddles_id", referencedColumnName = "id", insertable = false, updatable = false)
	private Riddles riddles;

	// Getters y setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getVideoId() {
		return videoId;
	}

	public void setVideoId(Long videoId) {
		this.videoId = videoId;
	}

	public Long getEventId() {
		return eventId;
	}

	public void setEventId(Long eventId) {
		this.eventId = eventId;
	}

	public Long getStoryId() {
		return storyId;
	}

	public void setStoryId(Long storyId) {
		this.storyId = storyId;
	}

	public Long getRiddlesId() {
		return riddlesId;
	}

	public void setRiddlesId(Long riddlesId) {
		this.riddlesId = riddlesId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Videos getVideo() {
		return video;
	}

	public void setVideo(Videos video) {
		this.video = video;
	}

	public Events getEvent() {
		return event;
	}

	public void setEvent(Events event) {
		this.event = event;
	}

	public Stories getStory() {
		return story;
	}

	public void setStory(Stories story) {
		this.story = story;
	}

	public Riddles getRiddles() {
		return riddles;
	}

	public void setRiddles(Riddles riddles) {
		this.riddles = riddles;
	}

}