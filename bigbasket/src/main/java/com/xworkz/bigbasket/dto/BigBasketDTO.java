package com.xworkz.bigbasket.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class BigBasketDTO {

	@NotNull
	@NotBlank(message = "customer can't be blank")
	private String customer;
	@NotNull
	@NotBlank(message = "address can't be blank")
	private String address;
	@NotNull
	@NotBlank(message = "location can't be blank")
	private String location;
	@NotNull
	@NotBlank(message = "contact can't be blank")
	private Long contact;
	@NotNull
	@NotBlank(message = "pinCode can't be blank")
	private Long pinCode;
	@NotNull
	@NotBlank(message = "bill can't be blank")
	private Double bill;
	@NotNull
	@NotBlank(message = "email can't be blank")
	private String email;
	@NotNull
	@NotBlank(message = "passWord can't be blank")
	@Size(min = 8, max = 9, message = "password chars should be between 8 & 9")
	private String passWord;
	@NotNull
	@NotBlank(message = "item can't be blank")
	private String item;
	@NotNull
	@NotBlank(message = "area can't be blank")
	private String area;

	public BigBasketDTO() {
		System.out.println("created :" + this.getClass().getSimpleName());
	}

}
