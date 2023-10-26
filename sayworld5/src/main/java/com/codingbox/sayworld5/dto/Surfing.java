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

@Entity
@Getter
@Setter
@SequenceGenerator(name = "guestbook_seq", initialValue = 1, allocationSize = 1)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Surfing {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "guestbook_seq")
	@Column(name= "surfing_id")
	private Long id;
	private String name;
	private String img;
	private String introduce;
	
	@ManyToOne
	@JoinColumn(name = "home_id")
	private Home home;

	public Surfing(String name, String img, String introduce, Home home) {
		super();
		this.name = name;
		this.img = img;
		this.introduce = introduce;
		this.home = home;
	}
	
}
