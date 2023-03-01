package com.xworkz.chiefminister.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.chiefminister.dto.CMDTO;

public interface CMService {
	
	Set<ConstraintViolation<CMDTO>> validateAndSave(CMDTO cmdto);

}
