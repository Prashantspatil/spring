package com.xworkz.satellite.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;

@Data
public class SatelliteDTO {
	
	private int id;
	
	@Size(min = 3, max = 20, message = "name can't be <3 & 20<")
	private String name;
	
	@NotNull(message = "station can't be null")
	private String station;
	
	@NotNull(message = "budget can't be null")
	private Double budget;
	
	@NotBlank(message = "localDate can't be blank")
	private String localDateTime;
	
	@NotNull(message = "chairman can't be null")
	private String chairman;
	
	public SatelliteDTO() {
		System.out.println("created :" + this.getClass().getSimpleName());
	}

}
