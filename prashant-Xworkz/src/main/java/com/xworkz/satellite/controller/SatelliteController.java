package com.xworkz.satellite.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.satellite.dto.SatelliteDTO;
import com.xworkz.satellite.service.SatelliteService;
@Controller
@RequestMapping("/")
public class SatelliteController {
	
	@Autowired
	private SatelliteService service;
	
	private List<String> station = Arrays.asList("thumba","sriharikota","bhadrak");
	private List<String> chairman = Arrays.asList("sarabhai","menon","dhawan","kiran","sivan","somanath");
	
	public SatelliteController() {
		System.out.println("created :" + this.getClass().getSimpleName());
	}
	
	@GetMapping("/save")
	public String onSatellite(Model model) {
		System.out.println("running onSatellite");
		model.addAttribute("chairman",chairman.toString().replace("[", "").replace("]", ""));
		model.addAttribute("station",station.toString().replace("[", "").replace("]", ""));
		return "Save";
	}
	
	@GetMapping("/launch")
	public String onSearch(@RequestParam int id,Model model) {
		System.out.println("running onSearch"+id);
		SatelliteDTO dto = this.service.findById(id);
		if(dto!=null) {
			model.addAttribute("dto",dto);
		}else {
			model.addAttribute("message","data not found");
		}
		return "Search";
	}
	
	@PostMapping("/save")
	public String onSatellite(SatelliteDTO dto,Model model) {
		System.out.println("running onSatellite in post method");
		Set<ConstraintViolation<SatelliteDTO>> violations = this.service.validateAndSave(dto);
		if(violations.isEmpty()) {
			System.out.println("no violations,go to success page"+dto);
			return "Save";
		}
		model.addAttribute("chairman",chairman);
		model.addAttribute("station",station);
		model.addAttribute("error",violations);
		return "Save";
	}
	
	@GetMapping("/searchbychairman")
	public String onSearchByChairman(@RequestParam String chairman,Model model) {
		System.out.println("running onsearchbychairman in controller"+chairman);
		List<SatelliteDTO> list = this.service.findByChairman(chairman);
		model.addAttribute("lists", list);
		return "SearchByChairman";
	}
	
	@GetMapping("/update")
	public String onUpdate(@RequestParam int id,Model model) {
		System.out.println("running onUpdate"+id);
		SatelliteDTO dto = this.service.findById(id);
		model.addAttribute("dto",dto);
		model.addAttribute("chairman",chairman);
		model.addAttribute("station",station);
		return "UpdateSatellite";
	}
	
	@PostMapping("/update")
	public String onUpdate(SatelliteDTO dto,Model model) {
		System.out.println("running onUpdate"+dto);
		Set<ConstraintViolation<SatelliteDTO>> constraintViolations = this.service.validateAndUpdate(dto);
		if(constraintViolations.size()>0) {
			model.addAttribute("errors",constraintViolations);
		}else {
			model.addAttribute("message","Satellite launch success...");
		}
		return "UpdateSatellite";
	}
	
	@GetMapping("/delete")
	public String onDelete(@RequestParam int id,Model model) {
		System.out.println("running onDelete"+id);
		SatelliteDTO dto = this.service.findById(id);
		model.addAttribute("dto",dto);
		model.addAttribute("chairman",chairman);
		model.addAttribute("station",station);
		return "DeleteSatellite";
	}
	
	@PostMapping("/delete")
	public String onDelete(SatelliteDTO dto,Model model) {
		System.out.println("running onDelete"+dto);
		Set<ConstraintViolation<SatelliteDTO>> constraintViolations = this.service.validateAndDelete(dto);
		if(constraintViolations.size()>0) {
			model.addAttribute("errors",constraintViolations);
		}else {
			model.addAttribute("message","Satellite launch success...");
		}
		return "DeleteSatellite";
	}

}
