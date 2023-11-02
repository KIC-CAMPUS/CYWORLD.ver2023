package com.codingbox.sayworld.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ItemDTO {

		private Long id;
	    private String category;
	    private String name;
	    private int price;
	    private String i_img;
	    private String i_file1;
		
	    public ItemDTO () {}
	    
	    public ItemDTO(String category, String name, int price, String i_img, String i_file1) {
			super();
			this.category = category;
			this.name = name;
			this.price = price;
			this.i_img = i_img;
			this.i_file1 = i_file1;
		
	    }

	    
}
