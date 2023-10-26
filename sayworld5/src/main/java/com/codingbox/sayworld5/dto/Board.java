package com.codingbox.sayworld5.dto;

import java.time.LocalDate;

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
@SequenceGenerator(name = "board_seq", initialValue = 1, allocationSize = 1)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString(of = {"id", "foldername", "posttitle", "content", "create", "hitcount"})
public class Board {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "board_seq")
	@Column(name = "board_id")
	private Long id;
	
	
	@ManyToOne
	@JoinColumn(name = "home_id")
	private Home home;
	
	
	private String foldername;
	private String posttitle;
	private String content;
	private LocalDate createDate;
	private int hitcount;
	
	public Board(String foldername, String posttitle, String content, LocalDate createDate, int hitcount
			,Home home) {
		super();
		
		this.foldername = foldername;
		this.posttitle = posttitle;
		this.content = content;
		this.createDate = createDate;
		this.hitcount = hitcount;
		this.home = home;
	}
	
	
	
}
