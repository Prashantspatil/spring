package com.xworkz.bigbasket.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "")
public class BigBasketEntity {

	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "customer")
	private String customer;
	@Column(name = "address")
	private String address;
	@Column(name = "location")
	private String location;
	@Column(name = "contact")
	private Long contact;
	@Column(name = "pinCode")
	private Long pinCode;
	@Column(name = "bill")
	private Double bill;
	@Column(name = "email")
	private String email;
	@Column(name = "passWord")
	private String passWord;
	@Column(name = "item")
	private String item;
	@Column(name = "area")
	private String area;

	public BigBasketEntity() {
		System.out.println("created :" + this.getClass().getSimpleName());
	}
}
