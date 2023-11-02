package com.codingbox.sayworld.dto;

public class MainDTO {

	private Long id;
	private String name;
    private String gender;
    private int year;
    private int month;
    private int day;
    private String minimi;
    
    public MainDTO() {
    	
    }

	public MainDTO(String name, String gender, int year, int month, int day, String minimi) {
		super();
		this.name = name;
		this.gender = gender;
		this.year = year;
		this.month = month;
		this.day = day;
		this.minimi = minimi;
	}



}
