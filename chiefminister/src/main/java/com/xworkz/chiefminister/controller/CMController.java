package com.xworkz.chiefminister.controller;

import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.chiefminister.dto.CMDTO;
import com.xworkz.chiefminister.service.CMService;

@Controller
@RequestMapping("/")
public class CMController {
	
	@Autowired
	private CMService cmService;
	
	public CMController() {
		System.out.println("created :" + this.getClass().getSimpleName());
	}
	
	@PostMapping("/cm")
	public String onCM(CMDTO cmdto,Model model) {
		System.out.println("running oncm");
		Set<ConstraintViolation<CMDTO>> constraintViolations=this.cmService.validateAndSave(cmdto);
		if(!constraintViolations.isEmpty()) {
			System.out.println("validation failed, display error message"+cmdto);
			constraintViolations.forEach((cv)->System.err.println(cv.getMessage()));
		}else {
			System.out.println("validation success, display success message");
		}
		return "CM";
	}

}
