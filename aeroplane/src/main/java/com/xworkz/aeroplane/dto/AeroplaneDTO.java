package com.xworkz.aeroplane.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;
	
@Getter
@Setter
public class AeroplaneDTO {
	
	private int id;
	@Size(min = 3, max = 20, message = "company can't be <3 & 20<")
	private String company;
	@Size(min = 3, max = 20, message = "name can't be <3 & 20<")
	private String name;
	@Size(min = 3, max = 20, message = "country can't be <3 & 20<")
	private String country;
	@NotBlank(message = "type can't be blank")
	private String type;
	@NotNull(message = "cost can't be null")
	private Double cost;
	
	public AeroplaneDTO() {
		System.out.println("created :" + this.getClass().getSimpleName());
	}

}
