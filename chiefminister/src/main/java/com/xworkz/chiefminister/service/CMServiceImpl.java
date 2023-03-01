package com.xworkz.chiefminister.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.stereotype.Service;

import com.xworkz.chiefminister.dto.CMDTO;
@Service
public class CMServiceImpl implements CMService {
	
	public CMServiceImpl() {
		System.out.println("created :" + this.getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<CMDTO>> validateAndSave(CMDTO cmdto) {
		System.out.println("running validateAndSave");
		ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
		Validator validator=factory.getValidator();
		Set<ConstraintViolation<CMDTO>> constraintViolations=validator.validate(cmdto);
		if(constraintViolations!=null && !constraintViolations.isEmpty()) {
			System.err.println("constraintviolation exists");
			return constraintViolations;
		}else {
			System.out.println("constraintviolation doesn't exist, data is valid");
			return Collections.emptySet();
		}
	}

}
