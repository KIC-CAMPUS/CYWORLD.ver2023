//package com.codingbox.sayworld.entity;
//
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToOne;
//import jakarta.persistence.OneToMany;
//import jakarta.persistence.SequenceGenerator;
//import lombok.AccessLevel;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//@Entity
//@Getter @Setter
//@SequenceGenerator(name = "orders_seq", initialValue = 1, allocationSize = 1)
//@NoArgsConstructor(access = AccessLevel.PROTECTED)
//public class Orders {
//    
//    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "orders_seq")
//    @Column(name= "order_id")
//    private Long orderid;
//    
//    @OneToMany(mappedBy ="orders")
//    private List<MyItem> myItems = new ArrayList<>();
//    
//    @ManyToOne
//    @JoinColumn(name = "user_id")
//    private Customer customer;
//    
//    @ManyToOne
//    @JoinColumn(name = "item_id") 
//    private Item item;
//
//	public Orders(Customer customer, Item item) {
//		super();
//		this.customer = customer;
//		this.item = item;
//	}
//
//
//  
//    
//}
//
