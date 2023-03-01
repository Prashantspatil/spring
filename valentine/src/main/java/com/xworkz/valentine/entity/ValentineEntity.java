package com.xworkz.valentine.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name= "valentine")
public class ValentineEntity {
	
	@Id
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="valentine_name")
	private String valentineName;
	@Column(name="places")
	private String places;
	@Column(name="gifts")
	private String gifts;
	
	public ValentineEntity() {
		System.out.println("created :" + this.getClass().getSimpleName());
	}

}
