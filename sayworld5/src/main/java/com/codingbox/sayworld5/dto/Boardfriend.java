package com.codingbox.sayworld5.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@SequenceGenerator(name = "boardfriend_seq", initialValue = 1, allocationSize = 1)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString(of = {"id", "friends", "friendurl"})
public class Boardfriend {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "boardfriend_seq")
	@Column(name= "friend_id")
	private Long id;
	private String friends;
	private String friendurl;
	
	@ManyToOne
	@JoinColumn(name = "home_id")
	private Home home;

	public Boardfriend(String friends, String friendurl, Home home) {
		super();
		this.friends = friends;
		this.friendurl = friendurl;
		this.home = home;
	}  
	
	
}
