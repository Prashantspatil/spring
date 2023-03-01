package com.xworkz.satellite.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xworkz.satellite.dto.SatelliteDTO;
import com.xworkz.satellite.entity.SatelliteEntity;
import com.xworkz.satellite.repository.SatelliteRepo;

@Service
public class SatelliteServiceImpl implements SatelliteService {
	
	@Autowired
	private SatelliteRepo satelliteRepo;
	
	public SatelliteServiceImpl() {
		System.out.println("created :" + this.getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<SatelliteDTO>> validateAndSave(SatelliteDTO dto) {
		System.out.println("running validateAndSave"+dto);
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<SatelliteDTO>> violations = validator.validate(dto);
		if(violations!=null && !violations.isEmpty()) {
			System.err.println("violations in dto"+dto);
			return violations;
		}
		System.out.println("violations not found");
		SatelliteEntity entity = new SatelliteEntity();
		entity.setBudget(dto.getBudget());
		entity.setChairman(dto.getChairman());
		entity.setLocalDateTime(dto.getLocalDateTime());
		entity.setName(dto.getName());
		entity.setStation(dto.getStation());
		boolean saved = this.satelliteRepo.save(entity);
		System.out.println("entity is saved"+saved);
		return Collections.emptySet();
	}
	
	@Override
	public SatelliteDTO findById(int id) {
		if(id>0) {
			SatelliteEntity entity = this.satelliteRepo.findById(id);
			if(entity!=null) {
				System.out.println("entity found in service for id"+id);
				SatelliteDTO dto = new SatelliteDTO();
				dto.setBudget(entity.getBudget());
				dto.setChairman(entity.getChairman());
				dto.setLocalDateTime(entity.getLocalDateTime());
				dto.setName(entity.getName());
				dto.setStation(entity.getStation());
				dto.setId(entity.getId());
				return dto;
			}
		}
		return SatelliteService.super.findById(id);
	}
	
	@Override
	public List<SatelliteDTO> findByChairman(String chairman){
		System.out.println("running findByChairman in service impli"+chairman);
		if(chairman!=null && !chairman.isEmpty()) {
			System.out.println("chairman data is valid...calling repo...");
			List<SatelliteEntity> entities = this.satelliteRepo.findByChairman(chairman);
			//List<E> --> List<D>
			List<SatelliteDTO> listOfDto = new ArrayList<SatelliteDTO>();
			for(SatelliteEntity entity : entities) {
				SatelliteDTO dto = new SatelliteDTO();
				dto.setBudget(entity.getBudget());
				dto.setChairman(entity.getChairman());
				dto.setId(entity.getId());
				dto.setLocalDateTime(entity.getLocalDateTime());
				dto.setName(entity.getName());
				dto.setStation(entity.getStation());
				listOfDto.add(dto);
			}
			System.out.println("size of dtos"+listOfDto.size());
			System.out.println("size of entities"+entities.size());
			return listOfDto;
		}else {
			System.err.println("chairman data is invalid");
		}
		return SatelliteService.super.findByChairman(chairman);
	}

	@Override
	public Set<ConstraintViolation<SatelliteDTO>> validateAndUpdate(SatelliteDTO dto) {
		System.out.println("running validateAndUpdate"+dto);
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<SatelliteDTO>> violations = validator.validate(dto);
		if(violations!=null && !violations.isEmpty()) {
			System.err.println("violations in dto"+dto);
			return violations;
		}
		System.out.println("violations not found");
		SatelliteEntity entity = new SatelliteEntity();
		entity.setBudget(dto.getBudget());
		entity.setChairman(dto.getChairman());
		entity.setLocalDateTime(dto.getLocalDateTime());
		entity.setName(dto.getName());
		entity.setStation(dto.getStation());
		boolean saved = this.satelliteRepo.save(entity);
		System.out.println("entity is saved"+saved);
		return Collections.emptySet();
	}

	@Override
	public Set<ConstraintViolation<SatelliteDTO>> validateAndDelete(SatelliteDTO dto) {
		System.out.println("running validateAndDelete"+dto);
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<SatelliteDTO>> violations = validator.validate(dto);
		if(violations!=null && !violations.isEmpty()) {
			System.err.println("violations in dto"+dto);
			return violations;
		}
		System.out.println("violations not found");
		SatelliteEntity entity = new SatelliteEntity();
		entity.setBudget(dto.getBudget());
		entity.setChairman(dto.getChairman());
		entity.setLocalDateTime(dto.getLocalDateTime());
		entity.setName(dto.getName());
		entity.setStation(dto.getStation());
		boolean saved = this.satelliteRepo.save(entity);
		System.out.println("entity is saved"+saved);
		return Collections.emptySet();
	}

}
