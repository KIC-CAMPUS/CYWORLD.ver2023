package com.codingbox.sayworld.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CustomerDTO {

		private Long id;
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
	    private String minimi;
		
	    public CustomerDTO () {}
	   
	    public CustomerDTO(String memberId, String password, String password_re, String name, String gender, int year, int month, int day,
				String phone, int dotory, String minimi) {
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
			this.minimi = minimi;
		}
	    
	    
}
