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
@Getter @Setter
@SequenceGenerator(name = "profiles_seq", initialValue = 1, allocationSize = 1)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString(of = {"id", "profilecontent"})
public class Profiles {

	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "profiles_seq")
	@Column(name= "profile_id")
	private Long id;
	private String profilecontent;
	
	@ManyToOne
	@JoinColumn(name = "home_id")
	private Home home;

	
	public Profiles(String profilecontent, Home home) {
		super();
		this.profilecontent = profilecontent;
		this.home = home;
	}
	
	


}
