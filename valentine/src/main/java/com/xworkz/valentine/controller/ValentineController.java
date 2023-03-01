package com.xworkz.valentine.controller;

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

import com.xworkz.valentine.dto.ValentineDTO;
import com.xworkz.valentine.service.ValentineService;

@Controller
@RequestMapping("/Valentine")
public class ValentineController {
	
	@Autowired
	private ValentineService valentineService;
	
	private List<String> places=Arrays.asList("bengaluru","mysore","tumkur","mandya");
	private List<String> gifts=Arrays.asList("watch","phone","chambu","teddy-bear");
	
	public ValentineController() {
		System.out.println("created :" + this.getClass().getSimpleName());
	}
	
	@GetMapping
	public String onValentine(Model model) {
		System.out.println("running onValentine get method");
		model.addAttribute("gifts",gifts);
		model.addAttribute("places",places);
		return "Valentine";
	}
	
	@PostMapping
	public String onValentine(ValentineDTO valentineDTO, Model model) {
		System.out.println("running onValentine post method");
		Set<ConstraintViolation<ValentineDTO>> constraintViolations=this.valentineService.validateAndSave(valentineDTO);
		if(constraintViolations.isEmpty()) {
			System.out.println("no violations,go to success page"+valentineDTO);
			return "ValentineSuccess";
		}
		model.addAttribute("gifts",gifts);
		model.addAttribute("places",places);
		model.addAttribute("error",constraintViolations);
		//System.out.println("violation in controller"+valentineDTO);
		return "Valentine";
		
	}

}
