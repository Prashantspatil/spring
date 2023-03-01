package com.xworkz.satellite.service;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.satellite.dto.SatelliteDTO;
import com.xworkz.satellite.entity.SatelliteEntity;

public interface SatelliteService {
	
	Set<ConstraintViolation<SatelliteDTO>> validateAndSave(SatelliteDTO dto);
	
	default SatelliteDTO findById(int id) {
		System.out.println("running findById in service");
		return null;
	}
	
	default List<SatelliteDTO> findByChairman(String chairman){
		return Collections.emptyList();
	}
	
	Set<ConstraintViolation<SatelliteDTO>> validateAndUpdate(SatelliteDTO dto);
	
	Set<ConstraintViolation<SatelliteDTO>> validateAndDelete(SatelliteDTO dto);

}
