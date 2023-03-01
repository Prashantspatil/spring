package com.xworkz.bigbasket.controller;

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

import com.xworkz.bigbasket.dto.BigBasketDTO;
import com.xworkz.bigbasket.service.BigBasketService;

@Controller
@RequestMapping("/")
public class BigBasketController {
	
	@Autowired
	private BigBasketService bigBasketService;
	
	private List<String> item=Arrays.asList("sunflower oil","tomato","chicken","mutton","egg");
	private List<String> area=Arrays.asList("rajajinagar","vijaynagar","prakashnagar","omnagar");
	
	public BigBasketController() {
		System.out.println("created :" + this.getClass().getSimpleName());
	}
	
	@GetMapping("/BigBasket")
	public String onBigBasket(Model model) {
		System.out.println("running onBigBasket");
		model.addAttribute("area",area);
		model.addAttribute("item",item);
		return "BigBasket";
	}
	
	@GetMapping("/search")
	public String onSearch(@RequestParam int id,Model model) {
		System.out.println("running onSearch for id"+id);
		BigBasketDTO bigBasketDTO=this.bigBasketService.findByID(id);
		if(bigBasketDTO!=null) {
			model.addAttribute("bigBasketDTO",bigBasketDTO);
		}else {
			model.addAttribute("message","data not found");
		}return "BigBasketSuccess";
	}
	
	@PostMapping("/BigBasket")
	public String onBigBasket(BigBasketDTO bigBasketDTO,Model model) {
		System.out.println("running onBigBasket in post method");
		Set<ConstraintViolation<BigBasketDTO>> constraintViolations=this.bigBasketService.validateAndSave(bigBasketDTO);
		if(constraintViolations.isEmpty()) {
			System.out.println("no constraintViolations, go to success page"+bigBasketDTO);
			return "BigBasketSuccess";
		}
		model.addAttribute("area",area);
		model.addAttribute("item",item);
		model.addAttribute("error",constraintViolations);
		return "BigBasket";
	}

}
