package com.codingbox.sayworld.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@SequenceGenerator(name = "customer_seq", initialValue = 1, allocationSize = 1)
@NoArgsConstructor
@ToString(of = {"id" ,"memberId", "password", "password_re", "name", "gender", "year", "month", "day", "phone", "dotory", "minimi" })
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_seq")
	@Column(name = "user_id")
	private Long id;
	@Column(name = "mem_id")
	private String memberId;
	private String password;
	private String password_re;
	private String name;
	private String gender;
	private int year;
	private int month;
	private int day;
	private String phone;
	private int dotory;
	private String open; 
	
	@OneToMany(mappedBy ="customer")
	private List<Home> homes = new ArrayList<>();
		
	public Customer(String memberId, String password, String password_re, String name, String gender, int year, 
			int month, int day, String phone, int dotory
			,String open) {
		super();
		this.memberId = memberId;
		this.password = password;
		this.password_re = password_re;
		this.name = name;
		this.gender = gender;
		this.year = year;
		this.month = month;
		this.day = day;
		this.phone = phone;
		this.dotory = dotory;
		this.open = open;
	
	}



}
