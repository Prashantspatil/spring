package com.xworkz.aeroplane.controller;

import java.util.ArrayList;
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

import com.xworkz.aeroplane.dto.AeroplaneDTO;
import com.xworkz.aeroplane.service.AeroplaneService;

@Controller
@RequestMapping("/")
public class AeroplaneController {

	@Autowired
	private AeroplaneService service;

	private  List<String> type = Arrays.asList("business", "cargo", "glider", "aircraft", "boeing");
	private  List<String> country = Arrays.asList("","india", "pakisthan", "nepal", "china");


	public AeroplaneController() {
		System.out.println("created :" + this.getClass().getSimpleName());
	}

	@GetMapping("/register")

	public String onAeroplane(Model model) {
		System.out.println("running onAeroplane");
		model.addAttribute("country", country.toString().replace("[", "").replace("]", ""));
		model.addAttribute("type", type);
		return "Registration";
	}

	@GetMapping("/search")
	public String onSearch(@RequestParam int id, Model model) {
		System.out.println("running onSearch" + id);
		AeroplaneDTO dto = this.service.findById(id);
		if (dto != null) {
			model.addAttribute("dto", dto);
		} else {
			model.addAttribute("message", "data not found");
		}
		return "Search";

	}

	@PostMapping("/register")
	public String onAeroplane(AeroplaneDTO dto, Model model) {
		System.out.println("running onAeroplane in post method");
		Set<ConstraintViolation<AeroplaneDTO>> violations = this.service.validateAndSave(dto);
		if (violations.isEmpty()) {
			System.out.println("no violations,go to success page" + dto);
			return "Registration";
		}
		System.out.println(country.toString() + "  "+ type.toString());
		
		model.addAttribute("country", country);
		model.addAttribute("type", type);
		model.addAttribute("error", violations);
		return "Registration";
	}
	
}
