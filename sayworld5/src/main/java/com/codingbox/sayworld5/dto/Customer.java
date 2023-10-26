package com.codingbox.sayworld5.dto;

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
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString(of = {"id" ,"memberId", "password", "name", "gender", "birth", "phone", "dotory", "minimi" })
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_seq")
	@Column(name = "user_id")
	private Long id;
	private String memberId;
	private String password;
	private String name;
	private String gender;
	private LocalDate birth;
	private String phone;
	private int dotory;
	private String minimi;
	
	@OneToMany(mappedBy ="customer")
	private List<Home> homes = new ArrayList<>();
		
	public Customer(String memberId, String password, String name, String gender, LocalDate birth, String phone, int dotory, String minimi
			) {
		super();
		this.memberId = memberId;
		this.password = password;
		this.name = name;
		this.gender = gender;
		this.birth = birth;
		this.phone = phone;
		this.dotory = dotory;
		this.minimi = minimi;
	
	}


}
