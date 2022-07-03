package com.akil.hibernate.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class song {
	//  songId,songName,singer
	
	
	@Id
	@Column(name="songId")
	private int id;
	
	@Column(name="songName")
	private String songName;
	
	@Column(name="singer")
	private String artist;
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	@Override
	public String toString() {
		return "song [id=" + id + ", songName=" + songName + ", artist=" + artist + "]";
	}

}
