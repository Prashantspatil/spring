package main.java.com.xworkz.forest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@NamedQuery(name = "findByName",query = "select dp from ForestEntity dp where dp.name='bhadra'")
@NamedQuery(name = "findByState",query = "select dp from ForestEntity dp where dp.state='sikkim'")
@NamedQuery(name = "findByNameAndStateAndArea",query = "select dp from ForestEntity dp where dp.name='omkar' and dp.state='tamilnadu' and dp.area='470'")
@NamedQuery(name = "findAreaByName",query = "select dp.area from ForestEntity dp where dp.name='pavan'")
@NamedQuery(name = "findIdByNameAndState",query = "select dp.id from ForestEntity dp where dp.name='satish' and dp.state='andhrapradesh'")
@NamedQuery(name = "findNameById",query = "select dp.name from ForestEntity dp where dp.id=7")
@NamedQuery(name = "findStateByNameAndArea",query = "select dp.state from ForestEntity dp where dp.name='mallan' and dp.area='430'")
@NamedQuery(name = "findCount",query = "select count (dp) from ForestEntity dp ")
@NamedQuery(name = "findMaxArea",query = "select max (dp.area) from ForestEntity dp ")
@Table(name = "forest")
public class ForestEntity {
	
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "state")
	private String state;
	@Column(name = "area")
	private String area;
	@Column(name = "type")
	private String type;
	
	public ForestEntity() {
		System.out.println("created :" + this.getClass().getSimpleName());
	}

	public ForestEntity(int id, String name, String state, String area, String type) {
		super();
		this.id = id;
		this.name = name;
		this.state = state;
		this.area = area;
		this.type = type;
	}

}
