package com.codingbox.sayworld.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="comments")
@Getter @Setter
@SequenceGenerator(name = "comment_seq", initialValue = 1, allocationSize = 1)
@ToString(of = {"num", "newcreate"})
public class Comment {

	@ManyToOne
	@JoinColumn(name = "home_id")
	private Board board;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "comment_seq")
	@Column(name = "comment_num")
	private Long num;
	
	private LocalDate newcreate;

	public Comment(Board board, LocalDate newcreate) {
		super();
		
		this.board = board;
		this.newcreate = newcreate;
	}
	
	
	
}
