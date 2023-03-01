package main.java.com.xworkz.festival.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "festival_table")
@NamedQuery(name = "findByIdAndName",query = "select entity from FestivalEntity entity where entity.id=:pk and entity.name=:n")
@NamedQuery(name = "findByNameAndRegionAndMainGod",query = "select entity from FestivalEntity entity where entity.name=:name and entity.region=:r and entity.mainGod=:g")
@NamedQuery(name = "findByMainGod",query = "select entity from FestivalEntity entity where entity.mainGod=:g")
@NamedQuery(name = "findTotalDaysByName",query = "select entity.totalDays from FestivalEntity entity where entity.name=:n")
@NamedQuery(name = "findRegionAndMainGodByNameAndId",query = "select entity.region,entity.mainGod from FestivalEntity entity where entity.name=:n and entity.id=:pk")
@NamedQuery(name = "findMainGodAndTotalDaysByName",query = "select entity.mainGod,entity.totalDays from FestivalEntity entity where entity.name=:na")
@NamedQuery(name = "findTotal",query = "select count (dp) from FestivalEntity dp ")
@NamedQuery(name = "findMaxTotalDays",query = "select max (dp.totalDays) from FestivalEntity dp ")
public class FestivalEntity {
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "region")
	private String region;
	@Column(name = "sweets")
	private String sweet;
	@Column(name = "main_god")
	private String mainGod;
	@Column(name = "total_days")
	private int totalDays;
	
	public FestivalEntity(String name, String region, String sweet, String mainGod, int totalDays) {
		super();
		this.name = name;
		this.region = region;
		this.sweet = sweet;
		this.mainGod = mainGod;
		this.totalDays = totalDays;
	}

}
