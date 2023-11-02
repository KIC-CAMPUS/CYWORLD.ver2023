//package com.codingbox.sayworld.entity;
//
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToOne;
//import jakarta.persistence.SequenceGenerator;
//import lombok.AccessLevel;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;
//
//@Entity
//@Getter
//@Setter
//@SequenceGenerator(name = "cart_seq", initialValue = 1, allocationSize = 1)
//@NoArgsConstructor(access = AccessLevel.PROTECTED)
//@ToString(of = {"id"})
//public class Cart {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cart_seq")
//    @Column(name = "cart_id")
//    private Long id;
//
//    @ManyToOne
//    @JoinColumn(name = "user_id")
//    private Customer customer;
//
//    @ManyToOne
//    @JoinColumn(name = "item_id")
//    private Item item;
//
//	public Cart(Customer customer, Item item) {
//		super();
//		this.customer = customer;
//		this.item = item;
//	}
//
//
//}
//
//
//
