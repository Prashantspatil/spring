package com.xworkz.snake.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="details")
public class SnakeDTO {
	
	@Id
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="age")
	private int age;
	@Column(name="place")
	private String place;
	@Column(name="dist")
	private String dist;
	@Column(name="taluk")
	private String taluk;
	@Column(name="village")
	private String village;

}
