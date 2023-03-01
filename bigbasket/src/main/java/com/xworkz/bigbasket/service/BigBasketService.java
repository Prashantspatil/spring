package com.xworkz.bigbasket.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.bigbasket.dto.BigBasketDTO;

public interface BigBasketService {
	
	Set<ConstraintViolation<BigBasketDTO>> validateAndSave(BigBasketDTO bigBasketDTO);
	
	default BigBasketDTO findByID(int id) {
		System.out.println("running findByID in service");
		return null;
	}

}
