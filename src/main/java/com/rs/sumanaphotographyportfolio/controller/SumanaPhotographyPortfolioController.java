package com.rs.sumanaphotographyportfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class SumanaPhotographyPortfolioController {
	
	@GetMapping("/")
	public String mainPage() {
		 return "index-1";
		
	}
	

}
