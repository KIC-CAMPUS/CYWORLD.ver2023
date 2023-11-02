package com.codingbox.sayworld.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Table(name= "my_Item")
@Entity
@Getter @Setter
@SequenceGenerator(name = "myitem_seq", initialValue = 1, allocationSize = 1)
@NoArgsConstructor
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
	@JoinColumn(name = "item_id")
	private Item item;
	
	private String File_Bg;
	private String My_Bgphoto;
	private String My_Room;
	private String My_Mu;
	private String My_Muname;
	private String My_Fo;
	private String My_Miname;
	private String File_Mu;
	private String File_Fo;
	private String File_Mi;

	public MyItem(Customer customer, Item item, String File_Bg, String My_Bgphoto, String My_Room, 
			String My_Mu, String My_Muname, String My_Fo, String My_Miname, String File_Mu, String File_Fo, String File_Mi) {
		super();
		this.customer = customer;
		this.item = item;
		this.File_Bg = File_Bg;
		this.My_Bgphoto = My_Bgphoto;
		this.My_Room = My_Room;
		this.My_Mu = My_Mu;
		this.My_Muname = My_Muname;
		this.My_Fo = My_Fo;
		this.My_Miname = My_Miname;
		this.File_Mu = File_Mu;
		this.File_Fo = File_Fo;
		this.File_Mi = File_Mi;
	}


}
