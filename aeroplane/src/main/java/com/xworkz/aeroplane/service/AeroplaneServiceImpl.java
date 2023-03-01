package com.xworkz.aeroplane.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.aeroplane.dto.AeroplaneDTO;
import com.xworkz.aeroplane.entity.AeroplaneEntity;
import com.xworkz.aeroplane.repository.AeroplaneRepo;
@Service
public class AeroplaneServiceImpl implements AeroplaneService {
	
	@Autowired
	private AeroplaneRepo aeroplaneRepo;
	
	public AeroplaneServiceImpl() {
		System.out.println("created :" + this.getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<AeroplaneDTO>> validateAndSave(AeroplaneDTO dto) {
		System.out.println("running validateAndSave");
		ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
		Validator validator=factory.getValidator();
		Set<ConstraintViolation<AeroplaneDTO>> violations=validator.validate(dto);
		if(violations!=null && !violations.isEmpty()) {
			System.err.println("violations in dto"+dto);
			return violations;
		}
		System.out.println("violations not found");
		AeroplaneEntity entity=new AeroplaneEntity();
		entity.setCompany(dto.getCompany());
		entity.setCost(dto.getCost());
		entity.setCountry(dto.getCountry());
		entity.setName(dto.getName());
		entity.setType(dto.getType());
		boolean saved = this.aeroplaneRepo.save(entity);
		System.out.println("entity is saved"+saved);
		return Collections.emptySet();
	}
	
	@Override
	public AeroplaneDTO findById(int id) {
		if(id>0) {
			AeroplaneEntity entity = this.aeroplaneRepo.findById(id);
			if(entity!=null) {
				System.out.println("entity found in service for id"+id);
				AeroplaneDTO dto = new AeroplaneDTO();
				dto.setCompany(entity.getCompany());
				dto.setCost(entity.getCost());
				dto.setCountry(entity.getCountry());
				dto.setName(entity.getName());
				dto.setType(entity.getType());
				return dto;
			}
		}
		return AeroplaneService.super.findById(id);
	}

}
