package com.xworkz.chiefminister.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class CMDTO {
	@NotNull(message = "cm name can't be null or blank")
	@Size(min = 3,max = 20,message = "cm name should be >3 & <20 chars")
	private String name;
	@NotBlank(message = "party can't be blank")
	private String party;
	@NotBlank(message = "state can't be blank")
	private String state;
	@NotNull(message = "tenure can't be null")
	@Min(value = 1,message = "tenure can't be less than ")
	private Integer tenure;
	@NotBlank(message = "portfolio can't be null")
	private String portfolio;
	
	public CMDTO() {
		System.out.println("created :" + this.getClass().getSimpleName());
	}

}
