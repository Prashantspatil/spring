package com.xworkz.valentine.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.valentine.dto.ValentineDTO;
import com.xworkz.valentine.entity.ValentineEntity;
import com.xworkz.valentine.repository.ValentineRepo;
@Service
public class ValentineServiceImpl implements ValentineService {
	
	@Autowired
	private ValentineRepo valentineRepo;
	
	public ValentineServiceImpl() {
		System.out.println("created :" + this.getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<ValentineDTO>> validateAndSave(ValentineDTO valentineDTO) {
		System.out.println("running validateAndSave");
		ValidatorFactory factory= Validation.buildDefaultValidatorFactory();
		Validator validator= factory.getValidator();
		Set<ConstraintViolation<ValentineDTO>> constraintViolations=validator.validate(valentineDTO);
		if(constraintViolations!=null && !constraintViolations.isEmpty()) {
			System.err.println("constraintViolations in dto"+valentineDTO);
			return constraintViolations;
		}
		System.out.println("constraintViolations not found");
		ValentineEntity valentineEntity=new ValentineEntity();
		valentineEntity.setName(valentineDTO.getName());
		valentineEntity.setValentineName(valentineDTO.getValentineName());
		valentineEntity.setGifts(valentineDTO.getGifts());
		valentineEntity.setPlaces(valentineDTO.getPlaces());
		boolean saved = this.valentineRepo.save(valentineEntity);
		System.out.println("entity data is saved"+saved);
		return Collections.emptySet();
	}

}
