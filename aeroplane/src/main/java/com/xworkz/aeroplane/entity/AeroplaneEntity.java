package com.xworkz.aeroplane.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="aeroplane")
public class AeroplaneEntity {
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "company")
	private String company;
	@Column(name = "name")
	private String name;
	@Column(name = "country")
	private String country;
	@Column(name = "type")
	private String type;
	@Column(name = "cost")
	private double cost;
	
	public AeroplaneEntity() {
		System.out.println("created :" + this.getClass().getSimpleName());
	}

}
