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
@SequenceGenerator(name = "guestbook_seq", initialValue = 1, allocationSize = 1)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString(of = {"id", "gbcreates", "gbcomments"})
public class GuestBook {

	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "guestbook_seq")
	@Column(name= "guestbook_id")
    private Long id;
    private LocalDate gbcreates;
    private String gbcomments;
   
    @ManyToOne
    @JoinColumn(name = "home_id")
    private Home home;


    public GuestBook(LocalDate gbcreates, String gbcomments, Home home) {
    	super();
    	this.gbcreates = gbcreates;
    	this.gbcomments = gbcomments;
    	this.home = home;
    	

	}
}