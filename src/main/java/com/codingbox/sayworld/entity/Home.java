package com.codingbox.sayworld.entity;


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
@ToString(of = {"id", "total", "img", "content", "introduce", "friend", "friendurl"})
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
	    private String friend1;
	    private String friend2;
	    private String friend3;
	    @Column(name= "friend_url1")
	    private String friendurl1;
	    @Column(name= "friend_url2")
	    private String friendurl2;
	    @Column(name= "friend_url3")
	    private String friendurl3;
	    private String url;
		
	    public Home(int today, int total, String img, String content, String introduce, String friend1, String friend2, String friend3, String friendurl1, String friendurl2,
	    		String friendurl3, String url, Customer customer) {
			super();
			this.today = today;
			this.total = total;
			this.img = img;
			this.content = content;
			this.introduce = introduce;
			this.friend1 = friend1;
			this.friend2 = friend2;
			this.friend3 = friend3;
			this.customer = customer;
			this.friendurl1 = friendurl1;
			this.friendurl2 = friendurl2; 
			this.friendurl3 = friendurl3; 
			this.url = url;
		}



	 
	      

	    }