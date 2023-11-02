package com.codingbox.sayworld.domain;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class MemberForm {

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
}
