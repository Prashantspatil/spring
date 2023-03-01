package com.xworkz.valentine.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class ValentineDTO {
	
	@Size(min = 3, max = 20, message = "name can't be <3 & 20<")
	private String name;
	@Size(min = 3, max = 20, message = "val name can't be <3 & 20<")
	private String valentineName;
	@NotBlank(message = "places can't be blank")
	private String places;
	@NotBlank(message = "gifts can't be blank")
	private String gifts;
	
	public ValentineDTO() {
		System.out.println("created :" + this.getClass().getSimpleName());
	}

}
