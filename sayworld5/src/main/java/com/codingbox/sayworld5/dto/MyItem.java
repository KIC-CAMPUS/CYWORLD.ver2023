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
@SequenceGenerator(name = "myitem_seq", initialValue = 1, allocationSize = 1)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString(of = {"id"})
public class MyItem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "myitem_seq")
	@Column(name= "my_num")
	private Long id;
	
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private Customer customer;
	
	@ManyToOne
	@JoinColumn(name = "order_id")
	private Orders orders;

	public MyItem(Customer customer, Orders orders) {
		super();
		this.customer = customer;
		this.orders = orders;
	}


}
