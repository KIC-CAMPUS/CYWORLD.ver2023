package com.codingbox.sayworld.entity;

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
@SequenceGenerator(name = "item_seq", initialValue = 1, allocationSize = 1)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString(of = {"id", "category", "name", "price", "i_img", "i_file1"})
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "item_seq")
	@Column(name= "item_id")
	private Long id;
	
	private String category;
	private String name;
	private int price;
	private String i_img;
	private String i_file1;
	
	public Item(String category, String name, int price, String i_img, String i_file1) {
		super();
		this.category = category;
		this.name = name;
		this.price = price;
		this.i_img = i_img;
		this.i_file1 = i_file1;
	}
	
	
}
