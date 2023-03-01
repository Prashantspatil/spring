package com.xworkz.satellite.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="satellite")
@NamedQuery(name="findByChairman",query = "select ent from SatelliteEntity ent where ent.chairman=:man")
public class SatelliteEntity {
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="station")
	private String station;
	
	@Column(name="budget")
	private double budget;
	
	@Column(name="localDateTime")
	private String localDateTime;
	
	@Column(name="chairman")
	private String chairman;
	
	public SatelliteEntity() {
		System.out.println("created :" + this.getClass().getSimpleName());
	}

}
