package com.xworkz.satellite.repository;

import java.util.Collections;
import java.util.List;

import com.xworkz.satellite.entity.SatelliteEntity;

public interface SatelliteRepo {
	
	boolean save(SatelliteEntity entity);
	
	boolean update(SatelliteEntity entity);
	
	boolean delete(SatelliteEntity entity);
	
	default SatelliteEntity findById(int id) {
		System.out.println("running findById");
		return null;
	}
	
	default List<SatelliteEntity> findByChairman(String chairman){
		return Collections.emptyList();
	}

}
