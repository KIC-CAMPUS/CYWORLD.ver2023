package com.codingbox.sayworld5.dto;


import jakarta.annotation.Generated;
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
@Getter @Setter
@SequenceGenerator(name = "home_seq", initialValue = 1, allocationSize = 1)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString(of = {"id", "total", "img", "content", "introduce", "friend"})
public class Home {
		
		@Id
		@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "home_seq")
		@Column(name= "home_id")
		private Long id;
	    

		@ManyToOne
		@JoinColumn(name = "user_id")
		private Customer customer;

		private int today;
	    private int total;
	    private String img;
	    private String content;
	    private String introduce;
	    private String friend;
	   
		
	    public Home(int today, int total, String img, String content, String introduce, String friend
	    		,Customer customer) {
			super();
			this.today = today;
			this.total = total;
			this.img = img;
			this.content = content;
			this.introduce = introduce;
			this.friend = friend;
			this.customer = customer;
		}
	    
	    

	    }