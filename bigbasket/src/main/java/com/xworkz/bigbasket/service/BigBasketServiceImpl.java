package com.xworkz.bigbasket.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.bigbasket.dto.BigBasketDTO;
import com.xworkz.bigbasket.entity.BigBasketEntity;
import com.xworkz.bigbasket.repository.BigBasketRepo;
@Service
public class BigBasketServiceImpl implements BigBasketService {
	
	@Autowired
	private BigBasketRepo bigBasketRepo;
	
	public BigBasketServiceImpl() {
		System.out.println("created :" + this.getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<BigBasketDTO>> validateAndSave(BigBasketDTO bigBasketDTO) {
		System.out.println("running validateAndSave");
		ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
		Validator validator=factory.getValidator();
		Set<ConstraintViolation<BigBasketDTO>> constraintViolations=validator.validate(bigBasketDTO);
		if(constraintViolations!=null && !constraintViolations.isEmpty()) {
			System.err.println("constraintViolations in dto"+bigBasketDTO);
			return constraintViolations;
		}
		System.out.println("constraintViolations not found");
		BigBasketEntity bigBasketEntity=new BigBasketEntity();
		bigBasketEntity.setAddress(bigBasketDTO.getAddress());
		bigBasketEntity.setArea(bigBasketDTO.getArea());
		bigBasketEntity.setBill(bigBasketDTO.getBill());
		bigBasketEntity.setContact(bigBasketDTO.getContact());
		bigBasketEntity.setCustomer(bigBasketDTO.getCustomer());
		bigBasketEntity.setEmail(bigBasketDTO.getEmail());
		bigBasketEntity.setItem(bigBasketDTO.getItem());
		bigBasketEntity.setLocation(bigBasketDTO.getLocation());
		bigBasketEntity.setPassWord(bigBasketDTO.getPassWord());
		bigBasketEntity.setPinCode(bigBasketDTO.getPinCode());
		boolean saved=this.bigBasketRepo.save(bigBasketEntity);
		System.out.println("entity data is saved"+saved);
		return Collections.emptySet();
	}
	
	@Override
	public BigBasketDTO findByID(int id) {
		if(id>0) {
			BigBasketEntity bigBasketEntity=this.bigBasketRepo.findByID(id);
			if(bigBasketEntity!=null) {
				System.out.println("entity is found in service for id"+id);
				BigBasketDTO bigBasketDTO=new BigBasketDTO();
				bigBasketDTO.setAddress(bigBasketEntity.getAddress());
				bigBasketDTO.setArea(bigBasketEntity.getArea());
				bigBasketDTO.setBill(bigBasketEntity.getBill());
				bigBasketDTO.setContact(bigBasketEntity.getContact());
				bigBasketDTO.setCustomer(bigBasketEntity.getCustomer());
				bigBasketDTO.setEmail(bigBasketEntity.getEmail());
				bigBasketDTO.setItem(bigBasketEntity.getItem());
				bigBasketDTO.setLocation(bigBasketEntity.getLocation());
				bigBasketDTO.setPassWord(bigBasketEntity.getPassWord());
				bigBasketDTO.setPinCode(bigBasketEntity.getPinCode());
			}
		}return BigBasketService.super.findByID(id);
	}

}
